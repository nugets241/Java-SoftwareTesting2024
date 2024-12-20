/**
 * @author      Ej Sobrepena <ej.sobrepena@tuni.fi>
 * @version     2024.03.19 (last modified)
 * @since       17.0 (minimum Java version)
 */
public class Book {

    /**
     * The title of the book.
     */
    private String title;

    /**
     * The author of the book.
     */
    private String author;

    /**
     * The ISBN of the book.
     */
    private String isbn;

    /**
     * The publication year of the book.
     */
    private int publicationYear;

    /**
     * The availability of the book.
     */
    private boolean isAvailable;

    /**
     * Creates a new book.
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param isbn The ISBN of the book.
     * @param publicationYear The publication year of the book.
     * @throws IllegalArgumentException If the title, author, or ISBN is null
     *                                  or empty, or if the publication year is
     *                                  negative or in the future.
     */
    public Book(String title, String author, String isbn, int publicationYear) {

        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title must not be null or empty");
        } else if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Author must not be null or empty");
        } else if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("ISBN must not be null or empty");
        } else if (publicationYear < 0) {
            throw new IllegalArgumentException("Publication year must not be negative");
        } else if (publicationYear > 2024) {
            throw new IllegalArgumentException("Publication year must not be in the future");
        }

        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    /**
     * Returns the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Returns the publication year of the book.
     *
     * @return The publication year of the book.
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Checks if the book is available.
     *
     * @return True if the book is available, false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability of the book.
     *
     * @param isAvailable The new availability of the book.
     */
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

// End of file
