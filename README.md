# country-app
Backend API based on [country-api.yaml](/openapi/country-api.yaml), integrated with frontend that retrieves and displays country flags using an Open API with two distinct views

## ✅ Overview

This is full-stack app with:

#### 🛠 Backend API using a Swagger/OpenAPI
- Contract models generated using OpenAPI generator from  [country-api.yaml](/openapi/country-api.yaml)
- More info on [backend-readme](./backend/README.md)

#### 🌍 Frontend (React)  calling Backend to display country flags
- 🎭 Two UI views (Country list view and Country details view)
-  More info on [frontend-readme](./frontend/README.md)


#### ✅ Automated tests (frontend and backend)
- mocks + integration unit test

#### 🚀 CI/CD with YAML pipeline to:  More info file [ci-cd.yml](./.github/workflows/ci-cd.yml)
- Run tests 
- Build app 
- Package for deployment

## 🧪 Technologies Used
- Backend: Spring Boot (Java 17), OpenAPI


- Frontend: React, REST API (https://restcountries.com/v3.1/all)


- Testing: 
  - Backend: JUnit + MockMVC 
  - Frontend: Jest + React Testing Library


- CI/CD: GitHub Actions with YAML


- Build Tools: Gradle (backend), npm (frontend)


- Packaging: Docker