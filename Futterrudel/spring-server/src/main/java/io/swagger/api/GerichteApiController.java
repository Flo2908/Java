package io.swagger.api;

import io.swagger.model.Futterrudel;
import io.swagger.model.Gericht;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-13T11:05:20.560Z")

@Controller
public class GerichteApiController implements GerichteApi {

    private static final Logger log = LoggerFactory.getLogger(GerichteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GerichteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Gericht>> getgerichte() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Gericht>>(objectMapper.readValue("[ {  \"ort\" : \"ort\",  \"preis\" : 6.0274563,  \"img\" : \"img\",  \"kategorie\" : \"kategorie\",  \"name\" : \"name\",  \"id\" : 0}, {  \"ort\" : \"ort\",  \"preis\" : 6.0274563,  \"img\" : \"img\",  \"kategorie\" : \"kategorie\",  \"name\" : \"name\",  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Gericht>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Gericht>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Futterrudel> putGericht(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Gericht body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Futterrudel>(objectMapper.readValue("{  \"personen\" : [ {    \"id\" : 1,    \"kuerzel\" : \"kuerzel\"  }, {    \"id\" : 1,    \"kuerzel\" : \"kuerzel\"  } ],  \"chat\" : {    \"nachrichten\" : [ {      \"nachricht\" : \"nachricht\",      \"name\" : \"name\",      \"zeitpunkt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 5    }, {      \"nachricht\" : \"nachricht\",      \"name\" : \"name\",      \"zeitpunkt\" : \"2000-01-23T04:56:07.000+00:00\",      \"id\" : 5    } ],    \"id\" : 5  },  \"timeslot\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"name\",  \"limit\" : 6,  \"verzehrort\" : \"verzehrort\",  \"werisstwas\" : {    \"personenId\" : 9,    \"gerichtId\" : 7,    \"anzahl\" : 3,    \"id\" : 2  },  \"id\" : 0,  \"organisiator\" : {    \"id\" : 1,    \"kuerzel\" : \"kuerzel\"  }}", Futterrudel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Futterrudel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Futterrudel>(HttpStatus.NOT_IMPLEMENTED);
    }

}
