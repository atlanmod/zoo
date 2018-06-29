# SMM: Structured Metrics Meta-model

## Scope

The SMM include elements representing the concepts needed to express a wide range of diversified measures.  It specifies the definition of the measures, but also the representation of their measurement results.  SMM does not details the representation of the entities measured, and assumes that those entities are represented using an other meta-model (Ecore, here).

The SMM is designed to allow both the measurement data, but also the measures upon which the measurements were established.
The value of SMM comes from the ability of various groups and vendors to be able to define library of measures against different structured models. Those libraries can then be exchanged, validated, or used to produce measurements. 
While SMM compliance does not mandate how to gather measurements, it is clear that without a proper understanding of the Meta-Model, such measures might lose most of their values.

### Terms & Definitions 

Those terms are used along this README, and thus need to be defined beforehand.

**Measure:** A method assigning comparable numerical or symbolic values to entities in order to characterize an attribute of the entities.
**Measurement:** A numerical of symbolic value assigned to an entity buy a measure.
**Measurand:** An entity quantified by a measurement.
**Unit of Measure:** a quantity in terms of which the magnitudes of other quantities within the same total order can be stated.
**Dimension:** A totally ordered range of values which can be stated as orders of magnitudes relative to one another or to an archetypal member.
**Measurement Accuracy:** The measurement by which another measurement may be wrong.
**Measurement Scope:** The domain (set of entities) to which a given measure may be applied.
**Measurement Range:** The range (set of comparable values) assignable by a given measure.

### Usage

In general, using SMM starts with the definition of measures and their libraries. Such libraries can of course be predefined, and made available by other practitioners.

Once the measures have been defined, the next step is to determine *what* will be measured. This is called *Defining the Observation*. This includes specifying the model to use (`ObservationScope`) for taking the measures, determining which measures we are interested in performing (`RequestedMeasures`), as well as determining and passing all the arguments that might be needed by our `requestMeasures` and their descendants. 

The next step is the *Measurement Step*, and will probably depend a lot on the implementation done. Regardless of how the process has been carried out, the measure library should provide sufficient information for a tool vendor to implement an **executable measuring**. 

The measure interpretation fall in two categories; There are the `Direct Measures`, that re taken directly against a measurand, and the others, that we call `Derived Measures`, as their result is based on other measures, direct or derived. Hence, every measures comes from a direct measure. Representing the measures as a graph shall be considered, in order to be sure that derived measures are correctly linked to their base. 

## Core
**SmmElement**
Abstract class constituting an atomic element of the model. Top class in the hierarchy. 

**SmmModel**
Entry point of a SMM model. Top-level container for all the elements of the SMM.

**SmmRelationship**
Represents Semantic association between SMM elements

**MeasureLibrary**
Top container of all the measure artifacts. It defines a reference set of measures that can be applied independently, and decoupled from the model under observation. It is possible to pre-define such libraries, and pass those to a builder so that the metrics can be applied to specific models without affecting the measures in the library.
Measure elements can be related across libraries and don't need to be restricted to their own library. 

**MeasureCategory**
Refers to measures, and other categories as its elements. A category represents the measures directly associated with an element, and the measures of each sub-category that are associated with this element. A measure can be in multiple categories, and a category can be a sub-category of other categories. This indicates that its measures are also measures of these other categories.
This class can be used to represent a family of similar measures to different scopes, for example, we can consider several measures: LOC in a file, LOC in a method, LOC in a program, which can all be sorted in the same category. The category of a metric can also indicate the kind of purpose for which the metric is used.

**CategoryRelationship**
Represent the relationship between Measure categories, and other Measure elements.

**TimeStamp Primitive Type**
This primitive represents a point in time, such as the combination of a date and a time within a day.
## Extensions
SMM provides a simple extension mechanisms that provide a uniform meta-model pattern for extending SMM. It allows ad-hoc users attributes and annotations definitions to instances of SMM Elements. 

**Attribute**
Attributes allow informations to be attached to any model element (i.e. `SmmElement`) in a form of a tagged value. The `tag` attribute represents the name of the attribute, whereas the `value` attribute represents its value. Since `tag` inherit `SmmElement`, it can also have a description. 

**Annotation**
Annotations allow textual description to be attached to any instance of a model element. 

## Measures
Measures are the evaluation processes to assign comparable numeric, or symbolic, values to entities, in order to characterize selected qualities or traits of those entities. Since many different measures are possible, they have to be characterized with differing dimensions, resolutions, accuracy, and so on. Furthermore, traits or characteristics may be generalized or specialized. Each measure has a *scope*: the set of entities to which it is applicable;  a range, the set of possible measurement results; and the measurable property (or trait) that the measure characterizes. 

For instance, the scope of a line counting measure would be a software application,  and line length as one of its measurable trait. Explicitly representing the scope and the measurable traits allows for the consideration of different measures. Each measurable trait may have multiple distinct measures.

**AbstractMeasureElement**: Abstract parent class for all the measure entities.

**Characteristic**: This class represents a property ( or trait) of the members in its scope, which may be characterized by applying a measure to those members. Specifying a characteristic indicates what aspect, trait, or property, the measure purports to measure.
Through the `parent` association, Characteristic provides a representation of a hierarchy of measures, based upon the abstraction of a measured trait. E.g.: A Length characteristic could be the parent of a *fileLength* characteristic, and a *programLength* characteristic. Finally *programLength* could be the parent of a *programLinesOfCodeLength* characteristic. 

**Scope**: Represents a set of Elements as domains for measures. The domain is a subset instances of a class specified by Scope's `class` attribute. The set of objects may be further restricted by a (optional) recognizer `Operation`. Note that SMM requires all the objects to be instances of a single class. 
The recognizer, if given, is a boolean operation applicable to instances of the named class. The measure's scope is restricted to those instances for which the recognizer returns true. 
Example: Area of a square where we don't have a class named square. 
```
BinaryMeasure: 
	Functor: Times
	Base Measure1: Side1 Length
	Base Measure2: Side2 Length
Scope: 
	Name: Square
	Description: Two dimensional closed object with 4 equal length sides.
```
For the measure above, the characteristic trait is likely to be "area" which could be a child characteristic of the more general "size". 

**Measure**: Abstract class modeling the specification of measures, either by name, by representing a derivation of base measures, or by representing method operations directly applied to the measured object. It has to meaningfully identify the measure applied, in order to produce a given measurement. 

Example: McCabe Cyclomatic complexity could be specified by its name: "McCabe's Cyclomatic Complexity", by a direct measurement operation, or by rescaling counts of either independent paths or choice points. 

A measure may alternatively be identified by citing a library of measure which includes the measure by name. A measure may be a refinement of another measure. The scope of the first measure is a subset of the second measure's scope. 

Attributes `measureLabelFormat` and `measurementLabelFormat` have to be specified using the labelFormat. Just like format strings, labelFormat is defined as a text portion with possible replacement expressed as argument index: `"This {1} of {0}"`. The arguments are defined in a comma separated list. Each of those arguments must follow a specific pattern. There's a standard syntax and also a shorthand version for some common cases. 

The standard syntax starts by specifying a context object, followed by ":", and then an operation whose name must be the name of a valid instance in the Operation class:
Example: `"Template Text": Context Object: OperationName, ContextObject.attribute, ...`
ContextObject represents the object that we are interested in collecting information from. It is related, or associated with the measurement, such as the Scope or the measure, or the measurand. 
OperationName defines the name of a **valid** instance of the Operation class, that is designed to return a string.

DefaultQuery relationship is designed to provide a way to specify a default value in the specific case where a non-direct measure (a measure that depends on an other measure for its value)  happens not to have any available value from what should have been its "base measure".

**UnitOfMeasure**: Provides a representation for units of measure. Standard units are expected here, for a better re-usability. 

**Operation**: Defines an operation to execute.  The language attribute specifies the language of the operation, such as "OCL", "XQuery", or "English", whereas the body attribute specifies the measurement operation expressed in the selected language.

Note that the operation body supports the use of replaceable parameters. This is accomplished by defining placeholders for incoming arguments, that will be replaced at runtime with a specific value. The `getArguments` and `getAllArguments` of the Measure class are designed to help in this regard. 
They must adhere to the following specification:  `'{'[typeName]parameterName['="'defaultValue'"']'}'` where typeName represents the type of the parameter, that has to be supported by the "type" attribute of the Argument class. parameterName represents the name of the parameter, and defaultValue represents a default value to offer (on getArguments()) or to use as Argument. This value is optional. 

**OCLOperation**:  This class allows for the definition and registration of OCL helper methods in the context of specific classifiers. 

**MeasureRelationship**: Abstract class representing any relationship between two measures.

**EquivalentMeasureRelationship**: A specific MeasureRelationship representing equivalency between two measures.

**RefinementMeasureRelationship**: Represents a relationship of refinement between two measures. 

**DimensionalMeasure**: This class models the specification of measures which assign numeric values that can be placed in order by magnitude. Dimensional measures have units of measures, and their values span a dimension. 

**GradeMeasure**: Represents a simple range-based grading or classifications based upon already defined dimensional measures.  A GradeMeasure consits of mapping intervals to symbols, where the intervals are parts of the underlying measure's dimension. E.g., 100 to 90 maps to "A", 80 up to 90 maps to "B", etc ... The underlying dimension consists of grade points. 
Furthermore, GradeMeasure may represent a purely qualitative evaluation with no quantitative base measure. 

**GradeMeasureRelationship**: Class representing a relationship between a Grade measure and a dimensional measure. 

**Interval**: Represents an interval, the range of values from a minimum to a maximum. Endpoints can be included or excluded. 

**GradeInterval**: Represents the mapping of an interval to a symbol that serves as a grade. 

**RankingMeasure**: Represents (as does GradeMeasure) simple range-based ranking or classifications based upon already defined dimensional measures. It differs from GradeMeasure in that RankingMeasures are DimensionalMeasures. 

**RankingMeasureRelationship**: Represents a relationship of ranking between measure and a base dimensional measure. 

**RankingInterval**: Mapping of an interval to a number that serves as a rank.

**Influence Data Type**: Enumeration defining an influence - a property of a relationship. helps understanding quickly how measures influence each other. 

**ScaleOfMeasurement Data Type**: Enumeration classifying the measures into four levels: nominal, ordinal, interval or ratio. May be used to develop taxonomy of measures.

**CollectiveMeasure**: Represent measures, which when applied to a given entity, accumulates measurements of entities similarly related to the given entity. 

**Accumulator Data Type**:  Defines DirectMeasure, which apply a given Operation to a measured entity.

**BinaryFunctor Data Type**: Defines the binary functor applied to two base measurements, to compute a binary measurement.

**DirectMeasure**: Measure applying a given operation to the measured entity.

**CountingMeasure**: Subclass of DirectMeasure where the given operation returns 0 or 1, based upon recognizing the measured entity. 

**BinaryMeasure**: Measure, which applied to a given entity accumulates measurements of two entities related to the given entity. The measurands of the base measurements need to be different as the measurand of the collective measurement.

**RatioMeasure**: Represents measures that are ratios of two base measures. 

**BaseMeasureRelationship**: Represents a relationship of hierarchy between a derived measure and its base measures.  

**BaseNMeasureRelationship**: Relationship of hierarchy between a CollectiveMeasure and a DimensionalMeasure. 

**Base1MeasureRelationship**:  Relationship of hierarchy between a BinaryMeasure and a DimensionalMeasure.

**Base2MeasureRelationship**: Relationship of hierarchy between a BinaryMeasure and a DimensionalMeasure.

**NamedMeasure**: Specifies measure that are well known, and can be specified only by their names, such as "McCabe Cyclomatic Complexity". 

**RescaledMeasure**: Measure that specifies a process that re-scales a measurement on an entity with one unit of measure, to obtain a second measurement of the same entity but with a different unit of measure. 

**RescaledMeasureRelationship**: Class representing a relationship of measure rescaling between a rescaled measure and a dimensional measure. 

## Measurements 

Measurement results are values from ordered sets. Such set can be nominal (eg. Poor, Fair, Good, Excellent) as long as there's an underlying order. A set may instead define a dimension where its values may be stated in orders of magnitude with respect to archetypal member. SMM allows for dimensional measurement, the magnitude is the measure's unit of measure. 

**MeasurementClass**: Represents the results of applying the associate measure to the associated measurand. Two measurements of the same measure, on the same measurand, can be distinguished by the associated Observation.

**MeasurementRelationship**: Represents any relationship between two measurements. 

**EquivalentMeasurementRelationship**: Represents any relationship of equivalence between two measurements.

**RefinementMeasurementRelationship**: Represents a relationship of refinement between two measurements. 

**DimensionalMesurement**: Class representing the results of applying a dimensional measure to an entity. The result is in terms of the measure's unit. 

**GradeMeasurement**: Represents the grade found by gradeMeasure. The base measurements share its measurand with this derived grading. 

**GradeMeasurementRelationship**: Represents a relationship between a grade measurement and a dimensional measurement. 

**RankingMeasurement**: Represents the grade found by RankingMeasure. Its ranking scheme mapped the ranking's underlying base measurement to the ranking's value.

**RankingMeasurementRelationship**: Represents a relationship between a ranking measurement and a dimensional measurement.

**CollectiveMeasurement**: This class represents the results of applying its collectiveMeasure to an entity:

 1. Apply the base measure to each contained element to obtain a set of base measurements.
 2. Apply the n-ary accumulator to the set of base measurements to obtain the measurement of the container.

**DirectMeasurement**: Represents the measurement results found by applying the measure's specified operation directly to the measurand.

**CountingMeasurement**: Particular subclass of DirectMeasurement which is very useful in counting. Its associated measure is CountingMeasure. 

**BinaryMeasurement**: Measurement associated with BinaryMeasure. 

**RatioMeasurement**: Measurement associated with RatioMeasure

**BaseMeasurementRelationship**: Relationship between a derivedMeasurement and a base dimensional measurement. 

**BaseNMeasurementRelationship**: Relationship between a collective of measurement and a base dimensional measurement.

**Base1MeasurementRelationship**: Relationship of hierarchy between a binary measurement and a dimensional measurement.

**Base2MeasurementRelationship**: Relationship of hierarchy between a binary measurement and a dimensional measurement.

**NamedMeasurement**: Represents the measurement results of applying to the Measurand measurement processes that are generally known and identifiable by name. 

**RescaledMeasurement**: Measurement results of applying the operation specified by a measure to rescale the measurement. The measure is a RescaledMeasure. 

**RescaledMeasurementRelationship**: Relationship of measurement rescaling between a rescaledMeasurement and a dimensionalMeasurement. 

## Observations 

Measurements are sometimes repeated, to distinguish these multiple measurements, the observation and scope class can represent contextual information, such as the time of the measurement and the identification of the measurement tool, and the artifacts that are under measurement. 

**Observation**: This class represents some of the contextual information which may be unique to this measurement such as date, measurer, and the tools used. 

**ObservationScope**: This class represents the model(s) or sub model that are the subject of the related observation. This information can be used initially to understand which model to gather measurements from, later by anyone wishing to recreate a new observation of the same artifacts.

**ObservedMeasure**: This class represents an association between observations and the measures that make up such observation. This class also serves to hold the list of measurements characterized by the related measure that are part of a given observation. 

**Argument**: Represents some of the variable arguments that are being passed to the measures that have Operations that make use of replaceable parameters. 

## Example 

#### 1- Customer Satisfaction Measure

![alt text](/emf-smm/examples/smm_example1.png?raw=true)

DeliveryTime is measured in Days. CustomerSatisfaction is measured based on grading of DeliveryTime. Consequently, GradeInterval endpoints are also expressed in Days. 

*More example coming soon.*

This XCore file and the README have been created using the version 1.2 Beta specification available at https://www.omg.org/spec/SMM/About-SMM/
