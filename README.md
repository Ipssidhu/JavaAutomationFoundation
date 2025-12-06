# JavaAutomationFoundation


## 🏥 Clinical Trial Patient Data Manager (Java Mini Project)

A small Java-based console project that simulates core patient management features used in clinical trial systems.

**Key Highlights:**
- Domain: Life Sciences / Clinical Trials
- Features: Add patients, prevent duplicates, validate age, search by patient ID
- Tech: Java, OOP (Encapsulation, Inheritance, Polymorphism), Collections (List, Set, Map), Custom Exceptions
- Design:
  - `Patient` → model entity
  - `PatientService` → business logic layer (add/search/validate)
  - `DuplicatePatientException`, `InvalidAgeException` → validation errors
  - `ClinicalAppTest` → runner simulating end-to-end usage

This mini project acts as a foundation for an automation framework that will later test clinical web applications and APIs.
