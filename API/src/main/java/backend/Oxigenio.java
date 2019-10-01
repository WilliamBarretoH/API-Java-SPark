package backend;

public class Oxigenio {

	private String oxigenio = "<html>\n" + 
			"  <head>\n" + 
			"    <script src=\"https://aframe.io/releases/0.9.2/aframe.min.js\"></script>\n" + 
			"    <script src=\"//cdn.rawgit.com/donmccurdy/aframe-extras/v3.13.1/dist/aframe-extras.min.js\"></script>\n" + 
			"    <!--\n" + 
			"    <script src=\"https://cdn.rawgit.com/jeromeetienne/AR.js/1.7.7/aframe/build/aframe-ar.js\"></script>\n" + 
			"    -->\n" + 
			"  </head>\n" + 
			"  <body>\n" + 
			"    <a-scene embedded arjs> \n" + 
			"      <a-assets>\n" + 
			"        \n" + 
			"        <!-- FORMA -->\n" + 
			"        <a-mixin \n" + 
			"            id=\"esfera\"\n" + 
			"            geometry=\"primitive: sphere\"\n" + 
			"        ></a-mixin>\n" + 
			"        \n" + 
			"        <!-- TAMANHO -->\n" + 
			"        <a-mixin\n" + 
			"            id=\"pequena\"\n" + 
			"                 static-body\n" + 
			"            geometry=\"radius: 0.04\"\n" + 
			"        ></a-mixin>\n" + 
			"        \n" + 
			"        <!-- COR -->\n" + 
			" \n" + 
			"        <a-mixin id=\"laranja\"\n" + 
			"                 material=\"color: orange\"\n" + 
			"        ></a-mixin>\n" + 
			"        <a-mixin id=\"azul\"\n" + 
			"                 material=\"color: #89cff0\"\n" + 
			"        ></a-mixin>\n" + 
			"        <a-mixin id=\"vermelho\" \n" + 
			"                 material=\"color: #f34336\"\n" + 
			"        ></a-mixin>\n" + 
			"         <!-- POSIÇÃO -->\n" + 
			"        \n" + 
			"      </a-assets>\n" + 
			"      \n" + 
			"      <!--a-marker preset=\"hiro\"-->\n" + 
			"        <a-camera \n" + 
			"                position=\"0 0 0\" \n" + 
			"                user-height=\"0\">\n" + 
			"        </a-camera>  \n" + 
			"\n" + 
			"        <!-- ESFERA TRANSPARENTE -->\n" + 
			"        <a-sphere\n" + 
			"        static-body\n" + 
			"        position=\"0 0 -2\"\n" + 
			"        opacity=\"0.3\"\n" + 
			"        color=\"lightgray\"\n" + 
			"        radius=\"0.6\"></a-sphere>\n" + 
			"\n" + 
			"        <!-- TEXTO -->\n" + 
			"        <a-text\n" + 
			"        value=\"O16 - Oxigenio\"\n" + 
			"        color=\"gray\"\n" + 
			"        position=\"-1 1 -2\"></a-text>\n" + 
			"        \n" + 
			"      <!-- ARCO 1 - MENOR -->\n" + 
			"      \n" + 
			"\n" + 
			"        <a-torus\n" + 
			"          position=\"0 0 -2\"\n" + 
			"          animation=\"property:rotation;\n" + 
			"          dur:1600;\n" + 
			"          loop:true;\n" + 
			"          easing:linear\"\n" + 
			"          color=\"gray\" \n" + 
			"          arc=\"360\" \n" + 
			"          radius=\"0.3\" \n" + 
			"          radius-tubular=\"0.003\"\n" + 
			"          rotation=\"360 0 360\"\n" + 
			"          ></a-torus>\n" + 
			"\n" + 
			"          <!-- ELETRONS ARCO 1 -->\n" + 
			"      <a-entity\n" + 
			"            position=\"0 0 -2\"\n" + 
			"            animation=\"property:rotation;\n" + 
			"            dur:1600;\n" + 
			"            loop:true;\n" + 
			"            easing:linear\"\n" + 
			"            scale=\"0.1 0.1 0.1\"\n" + 
			"            rotation=\"360 0 360\"\n" + 
			"                >\n" + 
			"                <a-sphere\n" + 
			"                    position=\"3 0 0\"\n" + 
			"                    scale=\"2 2 2\"\n" + 
			"                    radius=\"0.2\"\n" + 
			"                    mixin=\"azul\"\n" + 
			"                    ></a-sphere>\n" + 
			"\n" + 
			"\n" + 
			"                <a-sphere\n" + 
			"                    position=\"-3 0 0\"\n" + 
			"                    scale=\"2 2 2\"\n" + 
			"                    mixin=\"azul\"\n" + 
			"                    radius=\"0.2\"\n" + 
			"                    ></a-sphere>  \n" + 
			"        \n" + 
			"      </a-entity>\n" + 
			"      \n" + 
			"        <!-- ARCO 2 - MAIOR -->\n" + 
			"        <a-torus\n" + 
			"        position=\"0 0 -2\"\n" + 
			"        animation=\"property:rotation;\n" + 
			"        dur:1600;\n" + 
			"        loop:true;\n" + 
			"        easing:linear\"\n" + 
			"        color=\"gray\" \n" + 
			"        arc=\"360\" \n" + 
			"        radius=\"0.5\" \n" + 
			"        radius-tubular=\"0.003\"\n" + 
			"        rotation=\"360 360 360\"\n" + 
			"        >\n" + 
			"        </a-torus>\n" + 
			"      \n" + 
			"        <!-- ELETRONS ARCO 2 -  -->\n" + 
			"        <a-entity\n" + 
			"            position=\"0 0 -2\"\n" + 
			"            animation=\"property:rotation;\n" + 
			"            dur:1600;\n" + 
			"            loop:true;\n" + 
			"            easing:linear\"\n" + 
			"            rotation=\"360 360 0\"\n" + 
			"                  >\n" + 
			"          \n" + 
			"          <a-sphere\n" + 
			"          position=\"0 0.5 0\"\n" + 
			"          scale=\"0.19 0.19 0.19\"\n" + 
			"          mixin=\"azul\"\n" + 
			"          radius=\"0.2\"\n" + 
			"          ></a-sphere>\n" + 
			"      \n" + 
			"          <a-sphere\n" + 
			"          position=\"0 -0.5 0\"\n" + 
			"          scale=\"0.19 0.19 0.19\"\n" + 
			"          mixin=\"azul\"\n" + 
			"          radius=\"0.2\"\n" + 
			"          ></a-sphere>\n" + 
			"      \n" + 
			"          <a-sphere\n" + 
			"          position=\"-0.5 0 0\"\n" + 
			"          scale=\"0.19 0.19 0.19\"\n" + 
			"          mixin=\"azul\"\n" + 
			"          radius=\"0.2\"\n" + 
			"          ></a-sphere>\n" + 
			"      \n" + 
			"          <a-sphere\n" + 
			"          position=\"0.5 0 0\"\n" + 
			"          scale=\"0.19 0.19 0.19\"\n" + 
			"          mixin=\"azul\"\n" + 
			"          radius=\"0.2\"\n" + 
			"          ></a-sphere>\n" + 
			"      \n" + 
			"          <a-sphere\n" + 
			"          position=\"-0.5 0.09 0\"\n" + 
			"          scale=\"0.19 0.19 0.19\"\n" + 
			"          mixin=\"azul\"\n" + 
			"          radius=\"0.2\"\n" + 
			"          ></a-sphere>\n" + 
			"      \n" + 
			"          <a-sphere\n" + 
			"          position=\"0.5 0.09 0\"\n" + 
			"          scale=\"0.19 0.19 0.19\"\n" + 
			"          mixin=\"azul\"\n" + 
			"          radius=\"0.2\"\n" + 
			"          ></a-sphere>\n" + 
			"      \n" + 
			"      \n" + 
			"        </a-entity>\n" + 
			"        \n" + 
			"\n" + 
			"        <!-- NUCLEO PROTONS - (AMARELAS) -->\n" + 
			"      \n" + 
			"        <a-entity mixin=\"esfera laranja pequena meio\" static-body position=\"0.001 0.03 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera laranja pequena meio\" static-body position=\"0.01 0.02 -1.9\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera laranja pequena meio\" static-body position=\"-0.03 0.03 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera laranja pequena meio\" static-body position=\"0.01 -0.08 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera laranja pequena meio\" static-body position=\"0.01 0.1 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera laranja pequena meio\" static-body position=\"0.1 0.02 -1.9\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera laranja pequena meio\" static-body position=\"-0.1 0.03 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera laranja pequena meio\" static-body position=\"0.01 -0.08 -2\" ></a-entity>\n" + 
			"        \n" + 
			"        <!-- NUCLEO NEUTRONS - (AZUL) -->\n" + 
			"        <a-entity mixin=\"esfera vermelho pequena meio\" static-body position=\"0.1 0.03 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera vermelho pequena meio\" static-body position=\"0.1 0.02 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera vermelho pequena meio\" static-body position=\"-0.03 0.03 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera vermelho pequena meio\" static-body position=\"0.01 -0.08 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera vermelho pequena meio\" static-body position=\"0.01 0.1 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera vermelho pequena meio\" static-body position=\"0.1 0.02 -1.9\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera vermelho pequena meio\" static-body position=\"-0.1 0.03 -2\" ></a-entity>\n" + 
			"        <a-entity mixin=\"esfera vermelho pequena meio\" static-body position=\"0.01 -0.08 -2\" ></a-entity>\n" + 
			"      \n" + 
			"      \n" + 
			"      \n" + 
			"\n" + 
			"      <!--/a-marker-->\n" + 
			"      <!--a-entity camera></a-entity-->\n" + 
			"    </a-scene>\n" + 
			"  </body>\n" + 
			"</html>";
	
	
	public String getOxigenio() {
		
		return oxigenio;
	}
	
 
}