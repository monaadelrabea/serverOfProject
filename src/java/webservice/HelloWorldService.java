package webservice;
 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import org.apache.commons.codec.binary.Base64;


 
@Path("/hassan")
public class HelloWorldService {
        @POST
        @Path("/mona")
        public Response postMsg2(MultivaluedMap <String,String> val) {
       String fileName=val.getFirst("fileName")+2;
       System.out.println("mona");
       String filePath = "C:\\Users\\m@pc\\Documents\\NetBeansProjects\\itiProjectServer\\web\\WEB-INF\\images\\" + fileName;
        try{
         byte[] imageByteArray = decodeImage(val.getFirst("image"));
 
            // Write a image byte array into file system
            FileOutputStream imageOutFile = new FileOutputStream( filePath);
            imageOutFile.write(imageByteArray);

            imageOutFile.close();
 
            System.out.println("Image Successfully Manipulated!");
        } catch (FileNotFoundException e) {
            System.out.println("Image not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the Image " + ioe);
        }

        return Response.status(200).entity("inserted").build();

        }
          public static byte[] decodeImage(String imageDataString) {
        return Base64.decodeBase64(imageDataString.getBytes());
    }


}