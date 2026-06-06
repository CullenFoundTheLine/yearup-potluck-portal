# YUU Potluck Portal

A web application for managing potluck sign-ups. Attendees can submit their name, contact info, food item, and dietary notes. The backend stores all entries in a shared MongoDB Atlas database so the whole team can access the same data.

## Tech Stack

- Java 21
- Spring Boot 3.4.5
- Spring Data MongoDB
- MongoDB Atlas
- Lombok

## Prerequisites

- Java 21+
- Maven (or use the included `./mvnw` wrapper)
- Access to the MongoDB Atlas cluster (contact a team member for credentials)

## Setup & Running Locally

1. **Clone the repo**
   
   ```bash
   git clone https://github.com/CullenFoundTheLine/yearup-potluck-portal.git
   cd yearup-potluck-portal
   ```
1. **Create your `application.properties`**
   
   Create the file at `src/main/resources/application.properties` (this file is gitignored — never commit it):
   
   ```properties
   spring.application.name=potluck-portal
   spring.data.mongodb.uri=mongodb+srv://<username>:<password>@yuupotluckportal.uim6ivq.mongodb.net/yearup-potluck?appName=YUUPotLuckPortal
   ```
   
   Replace `<username>` and `<password>` with the credentials provided by your team.
1. **Set the MongoDB URI as an environment variable**
   
   In your terminal, run:
   
   ```bash
   export SPRING_DATA_MONGODB_URI='mongodb+srv://<username>:<password>@yuupotluckportal.uim6ivq.mongodb.net/yearup-potluck?appName=YUUPotLuckPortal'
   ```
1. **Run the app**
   
   ```bash
   ./mvnw clean spring-boot:run
   ```
1. **Verify it’s working**
   
   Open your browser and go to:
   
   ```
   http://localhost:8080/api/entries
   ```
   
   You should see a JSON list of potluck entries.

## Notes

- The `export` command only lasts for the current terminal session. You’ll need to run it again each time you open a new terminal.
- Never commit `application.properties` — it contains credentials and is listed in `.gitignore`.