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

## Measures

## Measurements 

## Observations 

## Example 


This XCore file and the README have been created using the version 1.2 Beta specification available at https://www.omg.org/spec/SMM/About-SMM/
