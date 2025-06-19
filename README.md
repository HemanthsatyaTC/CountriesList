# Countries App

## Overview

This Android application fetches a list of countries from a remote API, displays them in a RecyclerView, and follows Clean Architecture principles.

## Architecture

The app follows a Clean Architecture pattern with these layers:

-   **Domain Layer**: Contains core business logic and data models (entities).
-   **Data Layer**: Handles data retrieval from remote sources (API).
-   **UseCase Layer**: Contains use cases that orchestrate the data flow between the UI and data layer.
-   **App Layer**: Contains UI-related components like Activities, ViewModels, and Adapters.

## Tech Stack

-   Kotlin
-   Android SDK
-   Retrofit
-   Coroutines
-   LiveData
-   ViewModel
-   RecyclerView
-   JUnit


## Code Structure

app/
├── data/ # Data Layer
│ ├── api/ # Retrofit API interface
│ ├── model/ # Data transfer objects (DTOs)
│ └── repository/ # Data repository implementation
├── domain/ # Domain Layer
│ ├── model/ # Data models (entities)
│ └── usecase/ # Use cases
├── app/ # App Layer
│ ├── adapter/ # RecyclerView adapter
│ ├── viewmodel/ # ViewModels
├── test/ # Unit Tests

text

## API Endpoint

The app fetches country data from:

`https://gist.githubusercontent.com/peymano-wmt/32dcb892b06648910ddd40406e37fdab/raw/db25946fd77c5873b0303b858e861ce724e0dcd0/countries.json`

## UI Design

The UI displays countries in a RecyclerView with the following information for each country:

-   Name
-   Region
-   Code
-   Capital

## Future Enhancements

-   Implement error handling for API calls.
-   Add UI tests for user interactions.
-   Implement caching to improve performance.
