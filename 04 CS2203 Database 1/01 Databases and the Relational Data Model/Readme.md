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
  - provide the ability to have mutiple users insert, update and delete data at the same data file without _stepping on each other's toe_
  - a standard interface for data access
  - tools for data backup, data restore and recovery
  - handle other challenges: capability to work with huge volumes of data and users

![Database management system used by different departments in a bank](./images/database-systems.svg)

### The evolution of database management systems

- 1960s, physical and logical manipulation od data are mixed
- 1970, E.F. Codd (of IBM) separated the physical and logical representation
- Database Partitioning Feature (DPF): allows a database to be spread across many machines
- Structured Query Language (SQL)
- XML
- Cloud Computing

## Introduction to information models and data models

- Modeling is important
  - for future changes
  - future extensions

### Information models

- an abstract, formal representation of entities that includes their properties, relationships, opetations that can be performed on them
- describe the structure and meaning of data

#### The differents between information models and data models

![Information models and data models](./images/information-models-and-data-models.png)

| Information models                            | Data Models                          |
| --------------------------------------------- | ------------------------------------ |
| Conceptual (khái niệm)                        | Concrete (cụ thể)                    |
| Abstract modal for designers and operators    | Include many details                 |
| For its designer                              | For software developers              |
| hide all protocol and implementation details  | include protocol specific constructs |
| defines relationships between managed objects | A blueprint of any database system   |

## Types of information models

### 1. Network model

![A network model](./images/a-network-model.png)

### 2. Hierarchical model (thứ bậc)

![A hierarchical modal](./images/a-hierachical-modal.png)

- organizes its data using tree structures
- root of the tree is the parent followed by child nodes
  - a child node cannot have more than 1 parent
  - a parent can have many child nodes

### 3. Relational model

![A relational modal](./images/a-relational-model.png)

- Store data in simple data structure
- Access it throuh a high level set-at-a-time DML (Data Manipulation Language)
- Be independent from physical storage

### Entity Relationship model

![A entity relationship model](./images/a-entity-relationship-model.png)

- thinking of database as a collection of instances of entities
- entities is like object and it has attributes (data elements that characterize the entity)

### Object-relational model

- Similar to relational model
- however, it treats every entity as an object, and a relationship as an inheritance

### Other data models

- XML
- ORM (object-relational mapping)

## Roles and career path for database professionals

### Data Architect (Data modeler)

- Design an architecture that supports the organization's existing and future needs for data management
- Focuses on the data strategy, considers the big picture of the organization's data needs and ensures that data is collected, stored, processed, and used in a way that supports the organization's goals and objectives

### Database Architect

- Similar to data architect
- Database solution, focuses on the technical aspects of database design and implementation, such as selecting appropriate database technologies and determining the most efficient ways to store, index, and retrieve data

### Database Administrator

- Maintenance, performance, integrity (sự toàn vẹn) and security of a database

### Application Developer

- Developing applications that access databases

# The relational data model

## Relational data model: The big picture

![Relational data model in context of information model](./images/relaational-sata-model.png)

- Main aspects:
  - concept
  - constraints
  - relational algebra
  - relational calculus
- Some new words
  - entity integrity: tính toàn vẹn của thực thể
  - referential integrity: tính toàn vẹn tham chiếu
  - semantic constraints: rảng buộc ngữ nghĩa
  - relational algebra: đại số quan hệ
  - relational calculus: phép tính quan hệ

## Basic concepts

### Attributes

- characteristic of data
- has to have a name -> refer to that feature
- the name has to be as relevent as possibles for that feature
- Example: For a person, the attributes can be
  - Name
  - Sex
  - DateOfBirth

![Cars Relation](./images/car-relation-attribute.png)

### Domains

- A set of atomic values = a pool of values (giá trị nguyên tử) that are all of the same type (attribute)
  - A value is the smallest unit of data in the relational model
  - Example: The domain for the `Producer` is the set of all possible car producer names (like BMW, Audi, VW...)

= Domain has a name and a dimesion (number of values that domain has)

- Domains have a certain operational significance
  - If two attribute draw their value from 1 domain => comparisons make sense
  - If two attribute draw their value from different domains => comparisons dose not make sense

### Tuples

- An ordered set of values that describe data characteristics at one moment in time
- Informal terms: row in a table or record in a data file

### Relations

- Relation consists of a heading and a body

  - Heading: consists of a fixed set of attributes
  - Body: consists of a time-varying set of tuples
  - Relation degree: = the number of attributes on that relation (columns)
  - Relation cardinality (số lượng): = the number of tuples of that relation (rows)
  - Relation instance: state in which a relation exists at one moment in time

- Important properties
  - There are no duplicate tuples in a relation
  - Tuples are unordered
  - Attributes are unordered
  - All attribute values ar atomic

### Schemas

- Formal description of all the database relations and all the relationships existing between them

### Keys

- Used to define identifier for a relation's tuples

#### Candidate keys

- unique identifier for the tuples of a relation
- Every relation has at least one candidate key (the combination of all of its attributes)
  ![Candidate keys](./images/cadiate-keys.png);

- If relation has more than one candidate key
  - the one that is chosen to represent the relation is called the **primary key**
  - the remaining candidate keys are called **alternate keys**

#### Primary keys

- unique identifier for the tuples of a relation
- it is a **candidate key** that is chose to represent the relation in the database
- Relational DBMS allow a primary key to be specified the moment you create the relation (table)
- **surrogate key (khóa thay thế)**, **artifical key (khóa nhân tạo)**: ID with no meaning to real-world data, have unique values and will be used as a primary key

#### Foreign keys

- an attribute in one relation R2 whose values a required to match those of the primary key of some relation R1
- foreign key and the corresponding primary key should be defined on the same inderlying domain

## Relational data model constraints (Ràng buộc mô hình dữ liệu quan hệ)

- Those rules are\*- general ,specified at the database schema level, must be respected by each schema instance

### Entity integrity constraint (Ràng buộc toàn vẹn thực thể)

- No attribute participating in the primary key of the relation is allowed to accept null values

#### The justification

- Database relations correspond to entities from the real-word => entities in the real-world are distinguishable
- Primary keys perform the unique identification function in the relational model
- null primary key => would be a contradiction (some entity that has no identity that does not exist.)

### Referential integrity constraint (Ràng buộc toàn vẹn tham chiếu)

- If a relation R2 includes a foreign key FK matching the primary key PF of other relation R1, then every value of FK in R2 must either be equal to the value of PK in some tuple of R1 or be wholly null

#### The justification

- If some tuple t2 from relation R2 references some tuple t1 from relation R1. Then t1 must exist
- Given FK value must have a matching PK value somewhere in the referenced relation if that foreign key value is different from null
- Sometimes, it is necessary to permit the foreign key to accept null value

#### Three important questions

- Can the foreign key accept null values
- What should happen on an attempt to delete the primary key value of a foreign key reference? (_delete a car which is owned by a person_)
  - Three possibilities
    1. CASCADE: the delete operation `cascades` to delete those matching tuples (the tuples from the foreign key relation) is deleted too => _if car is deleted - the owner is deleted too_
    2. RESTRICT: the delete operation is `restricted` to the case where are no such matching tuples (it is rejected otherwise - ngược lại thì bị reject) => _the car can be deleted if only it is not owned by a person_
    3. NULLIFIES: the foreign key is set to null in all matching cases and then the tuple containing the primary key value is then deleted (only apply to the case FK accept null values) => _the car can be deleted after the `IdentificationNumber` attribute value from its former owner is set to null_
- What should happen on an attempt to update the primary key value of a foreign key reference?
  - Three possibilities
    1. CASCADE: updates the foreign key value of matching tuples => _if car id number is updated, the car owner id number attribute is updated too_
    2. RESTRICT: the update operation is `restricted` to the case where are no such matching tuples (it is rejected otherwise) => _car id number can only be updated if it is not owned by a person_
    3. NULLIFIES: the foreign key is set to null in all matching cases and then the tuple containning primary key value is updated => _car id number can be updated after the car owner id number attribute is set to null_

### Semantic integrity constraints (Ràng buộc toàn vẹn ngữ nghĩa)

- Refer to the correctness of the meaning of the data (like the street number is always positive number)
- If user attempts to execute and operation that would violate the constraint
  - The system reject the operation
  - Or it will perform some compensating action on some other part if the database to ensure that the overall result is still a correct state

#### Domain constraint

- The value of an attribute must fall within the range of values spetified by the domain

#### Null constraint

- The values of an attribute cannot be null (for example, `FirstName` and `LastName`)

#### Unique constraint

- The value of an attribute must be unique within the set of all tuples (for example, `SerialNumber` of a car in CARS relation)

#### Check constraint

- A prefefined conditional must be satisfied before data can be manipulated (for example, the `BirthYear` can't be greater than `CurrentYear`)
