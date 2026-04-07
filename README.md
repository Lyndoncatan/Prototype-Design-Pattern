# Prototype-Design-Pattern

Soft2

## How to run

Compile the Java source files:

```bash
mkdir -p out
javac -d out src/prototype/*.java
```

Run the prototype example:

```bash
java -cp out prototype.TestAnimal
```

## Example output

```text
=== Sheep Prototypes ===
Sheep{name='Wool', legs=4, sound='Baa', food='Grass'}
Wool the sheep says: Baa
Sheep{name='Fluffy', legs=4, sound='Baa', food='Grass'}
Fluffy the sheep says: Baa

=== Cow Prototypes ===
Cow{name='Bessie', legs=4, sound='Moo', food='Hay'}
Bessie the cow says: Moo
Cow{name='Daisy', legs=4, sound='Moo', food='Hay'}
Daisy the cow says: Moo

=== Horse Prototype ===
Horse{name='Spirit', color='Black', legs=4, sound='Neigh', food='Oats'}
Spirit the horse says: Neigh
```
