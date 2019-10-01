package backend;

import static spark.Spark.get;

import java.util.List;

import com.google.gson.Gson;

public class Controller<printWriter> {
	
	private Model model;
	
	public Controller(Model model) {
		this.model = model;
	}
	
	public void buscarAtomo() {
		get("/atomo/:nome", (req, res) -> {
			
			
			Atomo atomo = new Atomo(req.params(":nome"));
			Atomo atomosEncontrados = model.buscarNome(atomo);
			
			return res.body();
		});
	}

}
