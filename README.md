# YUU Potluck Portal

A potluck sign-up portal for YearUp students.

## Setup

1. Get the `application.properties` file from a team member and place it in `src/main/resources/`
1. In your terminal, set the database connection:
   
   ```bash
   export SPRING_DATA_MONGODB_URI='mongodb+srv://potluck-admin:<password>@yuupotluckportal.uim6ivq.mongodb.net/yearup-potluck?appName=YUUPotLuckPortal'
   ```
1. Run the app:
   
   ```bash
   ./mvnw clean spring-boot:run
   ```
1. Open `http://localhost:8080/api/entries` in your browser.