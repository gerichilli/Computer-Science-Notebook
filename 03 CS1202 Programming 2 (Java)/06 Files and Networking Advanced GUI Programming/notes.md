# Files and Networking; Advanced GUI Programming

## Learning Objectives:

- Understand files: writing and reading
- Learn the basics of networking.
- Study more GUI programming topics, including images and resources, text, transparency, anti-aliasing, actions, and buttons.

## File

### Reading and Writing Files

#### `FileReader`

- Accept the file name of the file as a parameter
- Creates an input stream that can be used for reading the file
- Throw an exception of type `FileNotFoundException` if the file doesn't exist
- Since FileReaders have only the primitive input methods, we should wrap `FileReader` in a `Scanner` or `BufferedReader` like

```java
BufferedReader in = new BufferedReader( reader );
```

#### `FileWriter`

- Accept the file name of the file as a parameter
- Creates an output stream
- We should wrap output stream in an object of type `PrintWriter`
- If no file named `result.txt` exists, a new file will be created
- After finish using a file, we should close it by method `close()`

### Files and Directories

- To fully specify a file, we must provide
  - the name of the file
  - the name of the directory
- File in current directory: just use file name like `result.txt`
- File not in current directory: use pathname
  - Absolute path names: Like `/home/eck/java/examples/data.dat`, `C:\eck\java\examples\data.dat`
  - Relative path names: Like `../examples/data.dat`, `..\examples\data.dat`
- An object of type File represents a file name rather than a file. Some File methods
  - `file.exists()`
  - `file.canRead()`
  - `file.canWrite()`
  - `file.isDirectory()`: returns true if the File object refers to a directory
  - `file.delete()`: Deletes the file, if it exists
  - `file.list()`: If the File object refers to a directory, this function returns an array of type String[] containing the names of the files in that directory

### File Dialog Boxes

- Using file dialog boxes with class `FileChooser`
- A graphical UI to let user select a file for input and output
  - open file dialog
  - save file dialog
- Some methods
  - `fileDialog.showOpenDialog(window)`: shows an open file dialog box on the screen
  - `fileDialog.showSaveDialog(window)`: shows a save file dialog box, with owner equal to `window`.
  - `fileDialog.setTitle(title)`: specifies a title to appear in the title bar of the dialog box
  - `fileDialog.setInitialFileName(name)`: sets the name that appears as a default name in the input box for the file name
  - `fileDialog.setInitialDirectory(directory)`: sets the directory that is shown in the dialog box when it first appears

## Networking

### URLs and URLConnections

- URL(universal resource locator) class is used to represent resources on the WWW
- After we have URL object, we can use it to open a `URLConnection` to the resource at that address

```java
public URL(String urlName) throws MalformedURLException
// or
public URL(URL context, String relativeName) throws MalformedURLException
```

- Then We call URL object's openConnection() method to set up a connection
- Some URLConnection methods
  - `getInputStream()`
  - `getContentType()`: The string returned by getContentType() is in a format called a mime type

### TCP / IP and Client / Server

- TCP: Transmission Control Protocol
- IP: Internet Protocol
- For 2 programs to communicate using TCP/IP, each program must create a socket and those sockets must be connected.
  - Waiting socket: listening for a connection
  - Other side of the connection: creates a socket that sends out a connection request to the listening socket.

#### Port number + IP

- several programs doing network communication at the same time in a single computer, or one program communicating with several other computers
- Think of port numbers as unique identifiers. They represent a logical connection to a particular piece of software running on the server.

### Sockets in Java

## Images and Resources

- An image is just a set of numbers which specify the color of each pixel in image. These number are stored in _frame buffer_

### Images and BufferedImages

- We can read an image from a source or draw it using graphics context(off-screen canvas)
- Draw the image in a rectangular area

```java
g.drawImage(img, x, y, this);
g.drawImage(img, x, y, width, height, imageObserver);
g.drawImage(img, dest x1, dest y1, dest x2, dest y2,
            source x1, source y1, source x2, source y2, imageObserver);
```

- `x,y`: position of top left corner
- `this`: `ImageObserver` - needed only when the complete image might not be available when the `drawImage()` method is called. Image will be drawn later, asynchronously, when it become available
- `source x1, source y1, source x2, source y2`: position of top left and bottom right
- `dest x1, dest y1, dest x2, dest y2`: opposite corners

#### Create image by drawing to an off-screen canvas

```java
public BufferedImage(int width, int height, int imageType)
```

- `width, height`: the width and the height of image
- `imageType`: spetifies how the color of each pixel is represented

  - `BufferedImage.TYPE_INT_RGB`
  - `BufferedImage.TYPE_INT_ARGB`
  - `BufferedImage.TYPE_BYTE_GRAY`

- Draw to a BufferedImage

```java
BufferedImage OSC = new BufferedImage(getWidth(),getHeight(),BufferedImage.TYPE_INT_RGB)
OSC.createGraphics() // returns an object of type Graphics2D
```

[BufferedImage](https://www.youtube.com/watch?v=17y2hZWJN0U&ab_channel=JoelRogness)

### Working With Pixels

- Image of type BufferedImage has some methods that let us to access the colors of each pixel easily.
  - `image.getRGB(x,y)`
  - `image.setRGB(x,y, rgb)`

### Resources

- Stored in the files that are in the same locations as the compiled class files
- `ClassLoader`: locate and load class files
- ClassLoader has a list of locations where it will look for class files, this is called class path

```java
ClassLoader cl = getClass().getClassLoader();
URL imageURL = cl.getResource("cards.png");
```

### Cursors and Icons

#### Cursors

- Represent the mouse's position on the computer's screen
- The cursor is represented by an object of type `java.awt.Cursor`
- A cursor has an asscociated image and a hot pot

### Image File I/O

```java
javax.imageio.ImageIO
ImageIO.write( image, format, file ) // returns a boolean value that is false
                                    // if the image format is not supported
ImageIO.read( inputFile ) // returns a BufferedImage
```

## Fancier Graphics

### Measuring Text

#### Font

- represented by the class Font
- FontMetrics is returned by g.getFontMetrics(font) (g is graphic context, font is object of type Font), it is used to measure characters and strings in the font
- Some FontMetrics object methods
  - getAscent
  - getDescent
  - getLeading
  - getHeight
  - charWidth

#### Transparency

#### Antialiasing

#### Strokes and Paints

- Stroke is an interface, not a class
- An object of type Stroke contains information about how lines should be drawn

```
BasicStroke line3 = new BasicStroke(3); // String with thickness equal to 3
```

#### Transforms and Shapes

## Actions and Buttons
