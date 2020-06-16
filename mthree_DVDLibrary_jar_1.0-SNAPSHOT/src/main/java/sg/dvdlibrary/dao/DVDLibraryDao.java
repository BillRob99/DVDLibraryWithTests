/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.dvdlibrary.dao;

import java.util.List;
import sg.dvdlibrary.dto.DVD;

/**
 *
 * @author utkua
 */
public interface DVDLibraryDao {

    /**
     * Adds the given DVD to the library and associates it with the given 
     * DVD title. If there is already a DVD associated with the given 
     * DVD title it will return that DVD object, otherwise it will 
     * return null.
     * 
     * @param dvdTitle title with which DVD is to be associated
     * @param dvd DVD to be added to the library
     * @return the DVD object previously associated with the given  
     * DVD title if it exists, null otherwise
     * @throws DVDLibraryPersistenceException
     */
    DVD addDVD(String dvdTitle, DVD dvd) throws DVDLibraryPersistenceException;

    /**
     * Returns a List of all DVDs in the library. 
     * 
     * @return DVD List containing all DVDs in the library.
     * @throws DVDLibraryPersistenceException
     */
    List<DVD> getAllDVDs()
     throws DVDLibraryPersistenceException;

    /**
     * Returns the DVD object associated with the given DVD title.
     * Returns null if no such DVD exists
     * 
     * @param dvdTitle title of the DVD to retrieve
     * @return the DVD object associated with the given DVD tile,  
     * null if no such DVD exists
     * @throws DVDLibraryPersistenceException
     */
    DVD getDVD(String dvdTitle)
     throws DVDLibraryPersistenceException;

    /**
     * Removes from the library the DVD associated with the given title. 
     * Returns the DVD object that is being removed or null if 
     * there is no DVD associated with the given title
     * 
     * @param dvdTitle title of DVD to be removed
     * @return DVD object that was removed or null if no DVD 
     * was associated with the given DVD title
     * @throws DVDLibraryPersistenceException
     */
    DVD removeDVD(String dvdTitle)
     throws DVDLibraryPersistenceException;    
    
    /**
     * Returns size of Map holding DVDs.
     * 
     * @return int with DVD count.
     * @throws DVDLibraryPersistenceException
     */
    int countDVDs()
     throws DVDLibraryPersistenceException;
    
    /**
     * Sets the date value of a DVD
     * @param value New date
     * @param title Title of the DVD
     * @throws DVDLibraryPersistenceException 
     */
    void setFieldDate(String value, String title)
     throws DVDLibraryPersistenceException;

    /**
     * Sets the rating of a DVD
     * @param value New Rating
     * @param title Title of DVD
     * @throws DVDLibraryPersistenceException 
     */
    void setFieldRating(String value, String title)
     throws DVDLibraryPersistenceException;
    
    /**
     * Sets the Director Name of a DVD.
     * @param value New Director Name
     * @param title Title of DVD
     * @throws DVDLibraryPersistenceException 
     */
    void setFieldDirectorName(String value, String title)
     throws DVDLibraryPersistenceException;
    
    /**
     * Sets the Studio of the DVD
     * @param value New Studio
     * @param title Title of DVD
     * @throws DVDLibraryPersistenceException 
     */
    void setFieldStudio(String value, String title)
     throws DVDLibraryPersistenceException;
    
    /**
     * Sets the Note of a DVD
     * @param value New Note
     * @param title Title of DVD
     * @throws DVDLibraryPersistenceException 
     */
    void setFieldNote(String value, String title)
     throws DVDLibraryPersistenceException;
    
    /**
     * Sets the imdb of DVD
     * @param value new imdb
     * @param title Title of DVD
     * @throws DVDLibraryPersistenceException 
     */
    void setFieldImdb(double value, String title)
     throws DVDLibraryPersistenceException;
    
}
