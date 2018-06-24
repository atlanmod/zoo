# Atlanmod Zoo

Atlanmod Zoo is a set of Eclipse Modeling Framework (EMF) Ecore models,
which can be easily integrated to projects that require these models.

## Objectives

The main goal of this project is to share EMF models among developers.

These models come from different [Atlanmod](http://www.atlanmod.org) projects,
where they are used  either for testing purposes
or as main artifacts.

For instance, the model of Java's abstract syntax comes from the [Modisco](https://www.eclipse.org/MoDisco/)
reverse engineering tool and can be used to build tools that use
Modisco's models as an input for metrics analysis, code modernization,
etc.

## Available Models

Currently, two kinds of models are available: (i) models for generating
standard EMF models and (ii) models for generating NeoEMF specific code.

### Standard EMF resources

Some examples of standard EMF available models are:
- [Simple graph](./emf-graph/): A simple syntax for representing oriented
graphs (mostly used for testing purposes.
- [Java](./emf-java/): Java language syntax model, used by the [Modisco](https://www.eclipse.org/MoDisco/) tool)
- [Cobol](./emf-cobol/): COBOL language syntax model.

### NeoEMF resources

Ecore models for using together with the [NeoEMF](http://www.neoemf.com) model persistence solution:

- [Java](./neoemf-java/): Java language syntax model.

## Usage

Models from the atlanmod Zoo are available as independent Maven plugins.
For instance, the dependency for Modisco Java's abstract syntax is:

``` xml
<dependency>
    <artifactId>emf-java</artifactId>
    <groupId>org.atlanmod.zoo</groupId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```


## Repository organization

This repository only contains models expressed in [Xcore](https://wiki.eclipse.org/Xcore).
The EMF underlying code is generated with the [Xtext Maven Plugin](https://www.eclipse.org/Xtext/documentation/350_continuous_integration.html).

## Contributing

This project is open for new models: if you want to share your own models,
follow the structured used in our models to create a new artifact and perform a pull request.


## Contact

> Gerson Sunyé: sunye@atlanmod.org