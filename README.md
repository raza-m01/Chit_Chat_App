# Chat Application - Client-Server Architecture

This repository contains a simple chat application implemented in Java using socket programming. The application follows a client-server architecture, allowing clients to connect to a server and exchange messages in a chat-like fashion.

## Overview

This chat application utilizes the following concepts:

1. **Networking - Socket Programming:**
   - A `ServerSocket` is created on the server side to listen for incoming connections.
   - The `Socket` class is used on the client side to establish a connection with the server.
   - Input and output streams (`BufferedReader` and `PrintWriter`) are employed for communication between the server and clients.

2. **Object-Oriented Programming (OOP):**
   - The code is organized using object-oriented principles, with separate classes for the `Client` and `Server`.
   - Encapsulation is used to bundle the socket and I/O operations into classes, promoting modularity.

3. **Multithreading Concepts:**
   - Multithreading is implemented to handle concurrent read and write operations on both the client and server sides.
   - Separate threads are used for reading and writing messages, ensuring smooth communication.

## Usage

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Building the Application

1. Clone the repository to your local machine.

    ```bash
    git clone https://github.com/raza-m01/chat-application-java.git
    ```

2. Navigate to the project directory.

    ```bash
    cd chat-application-java
    ```

3. Compile both `Client.java` and `Server.java` files.

    ```bash
    javac Client.java
    javac Server.java
    ```

### Running the Application

4. Start the server by running the `Server` class.

    ```bash
    java Server
    ```

5. Start multiple clients by running the `Client` class in separate terminal windows.

    ```bash
    java Client
    ```

6. Enter messages in the client's console to send messages to the server and vice versa.

7. Type "exit" to terminate the chat on either the client or server side.

## Structure

The repository consists of the following files:

- `Client.java`: Java class implementing the client-side of the chat application.
- `Server.java`: Java class implementing the server-side of the chat application.

# Screenshot
![Screenshot (905)](https://github.com/raza-m01/Chit_Chat_App/assets/113848902/af697602-4e5d-4aed-9b3a-0599ec61c44e)

## Contributing

If you'd like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix: `git checkout -b feature-name`.
3. Make your changes and commit them: `git commit -m 'Description of changes'`.
4. Push to the branch: `git push origin feature-name`.
5. Create a pull request on GitHub.



## Acknowledgments

- Inspired by the need for a simple chat application using Java and socket programming.
