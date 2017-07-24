package convertecep;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/")
public class Endereco {
	static DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Path("/teste1")
	public Response getExample(@QueryParam("param1")String param1){
		return Response.status(Status.OK).entity("hello " + param1).build();
	}

	@GET
	@Produces("text/plain")
	@Path("/teste2")
	public Response teste2(){
		return Response.status(Status.OK).entity("hello ").build();
	}

	@GET
	@Produces("application/json")
	@Path("/{cep}")
	public Response getEndereco(@PathParam("cep") String cep){
		CepResponse response = new CepResponse();
		response.setCep(cep);
		return Response.status(Status.OK).entity(response).build();
	}
}
