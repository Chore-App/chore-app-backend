# Setting up PostgreSQL with Docker

## Start PostgreSQL Container

Open your terminal and run the following Docker command to start a PostgreSQL container named `postgres-db`. This will set up a PostgreSQL server accessible on port 5432 of your localhost.

    docker run --name postgres-db -e POSTGRES_PASSWORD=docker -p 5432:5432 -d postgres

- `--name postgres-db` gives the container a name.
- `-e POSTGRES_PASSWORD=docker` sets the default password.
- `-p 5432:5432` maps the container's port to your localhost.
- `-d postgres` runs the PostgreSQL image in detached mode.

## Check Container Status

Verify that the container is running using:

    docker ps

Your `postgres-db` container should be listed as running.

# Setting Up the Database Tables

## Locate SQL Files

Ensure your SQL files are located within the `sql/ddl/` directory. The files you mentioned should be structured like so:

- `sql/ddl/categories.sql`
- `sql/ddl/chores.sql`
- `sql/ddl/user_credentials.sql`
- `sql/ddl/users.sql`

## Run SQL Commands

Open your preferred database management tool (e.g., DataGrip) and connect to the PostgreSQL server running in your Docker container. Use the following connection details:

- **Host:** `localhost`
- **Port:** `5432`
- **User:** `postgres`
- **Password:** `docker`

Once connected, navigate to your `sql/ddl/` directory within your database management tool. Open each `.sql` file (`categories.sql`, `chores.sql`, `user_credentials.sql`, `users.sql`) and run the SQL commands contained within to create the necessary tables in your database.

## Verify Table Creation

After running the SQL commands, verify that the tables (`users`, `user_credentials`, `categories`, and `chores`) have been created successfully in your database. You can do this by running a query to list all tables or by using the database management tool's UI to browse the database schema.

You now have PostgreSQL running in a Docker container with your required tables set up and ready to use.
