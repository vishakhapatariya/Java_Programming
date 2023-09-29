// Java Documentation Demo

/**
 * @author Vishakha
 * @version 1.0
 * @since 2023
 */
package javadocdemo;

/**
 * Library Book Details
 * @author vishakha
 * Class for library books
 */
public class Book {
    /**
     * @value 10 default value
     */
    static int val=10;

    /**
     * Parameterized Constructor
     * @param s Book Name
     */
    public Book(String s){
    }

    /**
     * Issue book to a student
     * @param roll roll no of a student
     * @throws Exception if book is not available, throws Exception
     */
    public void issue(int roll) throws Exception{
    }

    /**
     * Check if book is available
     * @param str Book Name
     * @return if book is available returns true else false
     */
    public boolean available(String str){
        return true;
    }

    /**
     * Get Book Name
     * @param id book id
     * @return returns book name
     */
    public String getName(int id){return "";}
}
