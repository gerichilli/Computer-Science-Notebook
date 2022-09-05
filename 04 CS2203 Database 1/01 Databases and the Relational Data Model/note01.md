# Database and information models

## What is a database

- a repository of data
- designed to support efficient data storage, retrieval and maintenance
- Data can be stored in various forms
  - tabular (bảng): relational database
  - hierarchical (thứ bậc) (tree structure): hierarchical database
  - graphs: network database

## What is database management system(DBMS)

- A set of software tools that control
  - Access
  - organize
  - store
  - manage
  - retrieve
  - maintain data
- Why do we need DBMS
  - a standard interface for data access
  - tools for data backup, data restore and recovery
  - handle other challenges: capability to work with huge volumes of data and users

### The evolution of database management systems

- 1960s, physical and logical manipulation od data are mixed
- 1970, E.F. Codd (if IBM) separated the physical and logical representation
- Database Partitioning Feature (DPF): allows a datavase to be spread across may machines
- Structured Query Language (SQL)
- XML
- Cloud Computing

## Introduction to information models and data models

- Information models
  - an abstract, formal representation of entities that includes their properties, relationships, opetations that can be performed on them
- Modeling is important
  - for future changes
  - future extensions
- Information models and data models are different
  - Information models
    - Conceptual (khái niệm)
    - abstract modal for designers and operators
    - hide all protocol and implementation details
    - defines relationships between managed objects
  - Data Models
    - Concrete
    - Include many details
    - For software developers
    - include protocol specific constructs
    - A blueprint of any database system

## Types of information models

### Network model

### Hierarchical modal

- root of the tree is the parent followed by child nodes

### Relational model

- Store data in simple data structure
- Access it throuh a high level set-at-a-time DML (Data Manipulation Language)
- Be independent from physical storage

### Entity Relationship modal

- thinking of database as a collection of instances of entities
- entities is like object and it has attributes

### Object-relational model

- Similar to relational model
- however, it treats every entity as an object, and a relationship as an inheritance

### Other data models

- XML
- ORM (object-relational mapping)

## Roles and career path for database professionals

### Data Architect

- Design an architecture that supports the organization's existing and future needs for data management

### Database Architect

- Database solution

### Database Administrator

- Maintenance, performance, integrity (sự toàn vẹn) and security of a database

### Application Developer

- Developing applications that access databases
