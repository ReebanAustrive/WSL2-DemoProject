# 🚀 WSL2 Demo Project - Migrated from Windows to WSL2

This project has been successfully migrated from Windows to Windows Subsystem for Linux 2 (WSL2) to leverage Linux-native development tools and improved performance.

## 📋 Overview

A Spring Boot REST API application demonstrating seamless development on WSL2. This project showcases how modern Java applications can run efficiently in a WSL2 environment, providing a bridge between Windows and Linux development workflows.

## 🛠️ Technology Stack

- **Java**: 21
- **Framework**: Spring Boot 3.4.1
- **Build Tool**: Gradle
- **Development Tool**: Spring Boot DevTools
- **API Type**: RESTful Web Services

## ✨ Features

- RESTful API endpoint for health checks
- CORS enabled for cross-origin requests
- Spring Boot DevTools for hot-reload during development
- Optimized for WSL2 environment
- Gradle wrapper for consistent builds

## 🔧 Prerequisites

To run this project on WSL2, you need:

1. **WSL2 Installed**: Windows Subsystem for Linux 2
   ```bash
   wsl --install
   ```

2. **Java 21**: Install OpenJDK 21 in your WSL2 distribution
   ```bash
   sudo apt update
   sudo apt install openjdk-21-jdk
   ```

3. **Git**: For version control
   ```bash
   sudo apt install git
   ```

## 🚀 Getting Started

### Clone the Repository

```bash
git clone https://github.com/ReebanAustrive/WSL2-DemoProject.git
cd WSL2-DemoProject
```

### Build the Project

```bash
./gradlew build
```

### Run the Application

```bash
./gradlew bootRun
```

The application will start on `http://localhost:8080`

## 📡 API Endpoints

### Health Check Endpoint

- **URL**: `/hello`
- **Method**: `GET`
- **Success Response**:
  ```json
  {
    "message": "Server is running perfectly through WSL2",
    "status": "success"
  }
  ```
- **Example**:
  ```bash
  curl http://localhost:8080/hello
  ```

## 🌐 CORS Configuration

The API is configured to accept requests from `http://localhost:5173`, making it ideal for frontend development with frameworks like React, Vue, or Svelte running on Vite's default development server.

## 🔄 Development Workflow

### Hot Reload

The project includes Spring Boot DevTools, which automatically restarts the application when changes are detected:

1. Make changes to your Java files
2. Save the files
3. The application will automatically restart

### Running Tests

```bash
./gradlew test
```

### Gradle Tasks

View all available Gradle tasks:
```bash
./gradlew tasks
```

## 📁 Project Structure

```
WSL2-DemoProject/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── demo/
│                       ├── testApplication.java
│                       └── controller/
│                           ├── HelloController.java
│                           └── MessageResponse.java
├── build.gradle
├── settings.gradle
├── gradle.properties
└── gradlew
```

## 🐧 WSL2 Migration Benefits

This project benefits from WSL2 in several ways:

1. **Native Linux Environment**: Access to Linux tools and utilities
2. **Better Performance**: Improved file system performance compared to WSL1
3. **Docker Integration**: Seamless Docker integration with Docker Desktop
4. **Cross-Platform Development**: Easy switching between Windows and Linux contexts
5. **Faster Build Times**: Native Linux execution speeds up Gradle builds

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License

This project is open source. Please check with the repository owner for license information.

## 📧 Contact

For questions or support, please open an issue in the GitHub repository.

---

**Note**: This project was originally developed on Windows and has been migrated to WSL2 for improved development experience and performance.
