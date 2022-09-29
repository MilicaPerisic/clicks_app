# Click Counter Application
Click counter application provides information on number of clicks that were made on advertisements. It's a REST API service that exposes data from MySQL database.

## Data
Data is stored in MySQL database and represents one hour of data for the following fields: id, timestamp (unix timestamp), type, campaign, banner, content_unit, network, browser, operating_system, country, state, city. It shows information on clicks made on advertisements. 
For upload and easier manipulation of data, unique identifier click_id was added to existing schema. 

### Example of data
```
7,02765744372096E+018,	1636254007,	DYNAMIC,	4824484,	14840628,	4386889,	241,	6, 5,	1,	2,	35187
```
Example data in csv file can be found in src/main/resources/data/click_log.csv and it can be used for testing purposes. Before perfroming import to MySQL database a unique indentifier must be provided and empty rows discarded.

## Application Details
Application provides two APIs:
1. Given a campaign, the API returns the amount of clicks that were made on advertisements that belong to this campaign.
Example: for the campaign 4510461 the API should return 13.
API: /click/find/{campaign}
2. Given a campaign, the API returns the amount of clicks that fall between a given start date and a given end date. Both dates should be passed as a string of the format „yyyy-mm-dd
hh:mm:ss“. The timezone should always be UTC.
Example: campaign 4510461, start date 2021-11-07 03:10:00 and end date 2021-11-07 03:30:00, the API should return 4.
API: /click/find/{campaign}/{startTimestamp}/{endTimestamp}

## Running the Application
### Requirements
1. Java JDK
2. MySQL database
3. Uploaded data to MySQL database
4. Postman for testing the APIs (or other similar service)

### Run/Test application
1. Modify settings in src/main/resources/application.properties: spring.datasource.url, spring.datasource.username, spring.datasource.password, server.port, to match your system settings.
2. Run the application
3. In Postman test application by running the following:
```
GET API: localhost:8080/click/find/4510461
Result: 13
```
```
GET API: localhost:8080/click/find/4510461/2021-11-07 03:10:00/2021-11-07 03:30:00
Result: 4
```
## Technologies Used
Application is written in [Java](https://www.java.com/en/), using [Spring Boot](https://spring.io/). Data is stored in [MySQL](https://www.mysql.com/) database. [Postman](https://www.postman.com/) is used for testing purposes. 




