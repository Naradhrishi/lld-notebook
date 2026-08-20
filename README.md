# lld-notebook
A curated journal documenting my Low-Level Design (LLD) learning journey, code snippets, images and daily progress.

## Day 1 - UML Class Diagram

Class Diagram is a Structural / Static diagram. It shows the blueprint of a class.

A class is represented by a rectangle with 3 compartments:

1.  **Abstract Class:** e.g., `If the class is abstract class then <<abstract>>`
1.  **Class Name:** e.g., `Animal`
2.  **Attributes:** `visibility name: type` -> `- age: int`
3.  **Methods:** `visibility method(): returnType` -> `+ make_sound(): void`

Visibility:
- `+` Public
- `-` Private
- `#` Protected