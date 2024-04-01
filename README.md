# Railway Ticket Booking REST API

This project is a REST API for booking railway tickets. It is built using Spring Boot and provides endpoints for managing tickets and ticket bookings.

## Features

- CRUD operations for trains and stations
- Book tickets for a specific train and date
- Get details of booked tickets
- Cancel booked tickets

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL (or your preferred database)
- Maven (for dependency management)
- Postman (for testing APIs)

- ## API Endpoints
- `GET /railway/tickets`: Get a list of all Passengers
- `POST /railway/tickets: Book a ticket.
- `GET /railway/tickets/{id}`: Get details of a ticket.
- `DELETE /railway/tickets/{id}`: Cancel a ticket.

## Getting Started

### Prerequisites

- Java 8 or higher installed
- MySQL installed and running
- Postman (optional, for testing)

### Installation

1. Clone the repository:

   ```sh
   git clone https://github.com/your-username/railway-ticket-booking-api.git


## Setup
1. Clone the repository: `git clone https://github.com/username/railway-ticket-booking-api.git`
2. Navigate to the project directory: `cd railway-ticket-booking-api`
3. Open `application.properties` and configure your MySQL database connection.
4. Run the application: `mvn spring-boot:run`
