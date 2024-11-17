# DACHSER SSCC Validation Application

This project is a web application for validating SSCC (Serial Shipping Container Code) numbers. It consists of a backend service built with Spring Boot and a frontend application built with Angular. This README provides instructions on how to set up and run the application.

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- [Docker](https://www.docker.com/get-started) (for containerization)
- [Docker Compose](https://docs.docker.com/compose/) (for managing multi-container applications)
- [Node.js](https://nodejs.org/) (for building the frontend)
- [Angular CLI](https://angular.io/cli) (for running the Angular application)

## Project Structure
```
/DACHSER
├── backend
│ ├── Dockerfile
│ ├── src
│ └── ...
├── frontend
│ ├── Dockerfile
│ ├── src
│ └── ...
└── docker-compose.yml
```


## Running the Application

### Step 1: Clone the Repository

Clone the repository to your local machine:

```bash
git clone https://github.com/Lucasnakajima/Dachser
cd DACHSER
```

### Step 2: Build and Run with Docker Compose

Navigate to the root directory of the project (where the `docker-compose.yml` file is located) and run the following command:

```bash
docker-compose up --build
```


This command will:

- Build the Docker images for the backend and frontend services.
- Start the PostgreSQL database service.
- Start the backend and frontend services.

### Step 3: Access the Application

Once the services are up and running, you can access the application in your web browser:

- **Frontend**: [http://localhost:4200](http://localhost:4200)
- **Backend API**: The backend API will be available at [http://localhost:8080/api/validate](http://localhost:8080/api/validate)

### Step 4: Validate SSCC Numbers

To validate an SSCC number:

1. Open the frontend application in your browser.
2. Enter the SSCC number in the input field.
3. Click the "Validate" button.
4. The application will display whether the SSCC is valid or invalid.

### Step 5: Stopping the Application

To stop the application, press `Ctrl + C` in the terminal where the Docker Compose command is running. You can also run:

```bash
docker-compose down
```

This command will stop and remove all the containers created by Docker Compose.

## Additional Information

- The backend service uses PostgreSQL as the database to store SSCC validation records.
- The frontend is built using Angular and communicates with the backend via HTTP requests.
