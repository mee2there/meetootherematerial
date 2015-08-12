package innovation.meetoothere.json;

import innovation.meetoothere.MyApplication;

import static innovation.meetoothere.extras.UrlEndpoints.URL_BOX_OFFICE;
import static innovation.meetoothere.extras.UrlEndpoints.URL_CHAR_AMEPERSAND;
import static innovation.meetoothere.extras.UrlEndpoints.URL_CHAR_QUESTION;
import static innovation.meetoothere.extras.UrlEndpoints.URL_PARAM_API_KEY;
import static innovation.meetoothere.extras.UrlEndpoints.URL_PARAM_LIMIT;
import static innovation.meetoothere.extras.UrlEndpoints.URL_UPCOMING;

/**
 * Created by Windows on 02-03-2015.
 */
public class Endpoints {
    public static String getRequestUrlBoxOfficeMovies(int limit) {

        return URL_BOX_OFFICE
                + URL_CHAR_QUESTION
                + URL_PARAM_API_KEY + MyApplication.API_KEY_ROTTEN_TOMATOES
                + URL_CHAR_AMEPERSAND
                + URL_PARAM_LIMIT + limit;
    }

    public static String getRequestUrlUpcomingMovies(int limit) {

        return URL_UPCOMING
                + URL_CHAR_QUESTION
                + URL_PARAM_API_KEY + MyApplication.API_KEY_ROTTEN_TOMATOES
                + URL_CHAR_AMEPERSAND
                + URL_PARAM_LIMIT + limit;
    }
}
