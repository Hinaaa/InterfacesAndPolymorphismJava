# Media Player Example

## Overview:
This project demonstrates the use of polymorphism in Java with the concept of interfaces. It involves controlling media playback through a common interface (`Playable`), where both music and video players implement this interface to provide the functionality of playing their respective media.

## How It Works:
- **Playable Interface:** This interface defines a `play()` method, which is implemented by both `MusicPlayer` and `VideoPlayer` classes to play respective media.
- **MusicPlayer Class:** Implements `Playable` and provides an implementation for the `play()` method, indicating that a music track is being played.
- **VideoPlayer Class:** Implements `Playable` and provides an implementation for the `play()` method, indicating that a video with music is being played.
- **MediaController Class:** A controller class that uses the `Playable` interface to manage and play media, regardless of whether it’s audio or video.

## Key Concepts:
- **Polymorphism:** Both `MusicPlayer` and `VideoPlayer` implement the same `Playable` interface, and the `MediaController` class can call the `play()` method on any object that implements `Playable`.
- **Interface Implementation:** `Playable` defines a contract (`play()` method), which is implemented by both media player classes.
- **Method Overriding:** Both `MusicPlayer` and `VideoPlayer` override the `play()` method to provide specific implementations for music and video media types.

## Flow:
- **MusicPlayer:** Plays music when the `play()` method is invoked.
- **VideoPlayer:** Plays video and music together when the `play()` method is invoked.
- **MediaController:** Calls the `play()` method on `Playable` objects (either `MusicPlayer` or `VideoPlayer`) to control media playback.

## Files:
- **Main.java:** The entry point where the objects of `MusicPlayer`, `VideoPlayer`, and `MediaController` are created and used to demonstrate the functionality.
- **Playable.java:** The interface that defines the `play()` method, implemented by both `MusicPlayer` and `VideoPlayer`.
- **MusicPlayer.java:** Implements the `Playable` interface and plays music.
- **MediaController.java:** Uses the `Playable` interface to control and play media (either music or video).
- **VideoPlayer.java:** Implements the `Playable` interface and plays video and music.

## Requirements:
- **Java 17+**
- **IDE** (e.g., IntelliJ IDEA)
