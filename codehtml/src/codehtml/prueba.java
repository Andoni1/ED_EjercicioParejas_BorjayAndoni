<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Libreria</title>
    <!-- estilso css-->
    <link rel="stylesheet" href="css/estilos.css">
    <!--fonts/letras-->
    <link rel="stylesheet" href="fonts/letra-biblioteca.ttf">
</head>
<body>
<div id="contenedor">
                             <!--Header-->
<nav>
    <div id="logo"></div>
    <h1>tick tack zubiri tickets</h1>
        <form>
              <div> <p>Usuario: </p><input type="text" placeholder="Introduce tu usuario"></div> 
              <div> <p>Contraseña</p> <input type="text" placeholder="Introduce tu contraseña"> </div> 
              <div><button type="submit">Enviar</button></div> 
        </form>
</nav>


                             <!---Main-->
<div id="contenedor_main">
    <main>
        <aside id="aside_izq">
            <div class="div_izq">
                <h4>Menu</h4>
                <div id="div_lista_izq">
                <ul>
                    <li><a href="noticias.html">Ultimas noticias</a></li>
                    <li><a href="conciertos.html">Proximos conciertos</a></li>
                    <li><a href="video.html">Galeria de video</a></li>
                    <li><a href="audio.html">Galeria de audio</a></li>
                    <li><a href="fotos.html">Fotos de conciertos</a></li>
                    <li><a href="entradas.html">Comprar entradas</a></li>
                    
                </ul>
                </div>
            </div>
            
            <div class="div_izq">
                <h4>Susribete a nuestro boletin</h4>
                <p>Introduce tu correo</p><input type="text" placeholder="Introduce tu correo">
                <button type="submit">Aceptar</button>
                    
            </div>
            <div class="div_izq">
             <h4>Artistas destacados</h4>
             <input type="text" placeholder="Selecciona el artista">
            </div>
        </aside>

        <div id="div_main_central"><p> Pagina Plantilla</p></div>
       
       
        <aside id="aside_drch">
            <div class="div_drch">
                <h4>Proximos Conciertos</h4>
                <div id="div_lista_izq_drch">
                    <ul>
                        <li><a href="#">MIchel head-16 de noviembre</a></li>
                        <li><a href="#">Roling Stones 3 de diciembre</a></li>
                        <li><a href="#">U2 25 de enero</a></li>
                        <li><a href="#">Iron miden 6 de febrero</a></li>
                        <li><a href="#">ACDC 21 de abril</a></li>
                        <li><a href="#">Manlyn manson 23 de agosto</a></li>
                    </ul>
                </div>
            </div>
            <div  class="div_drch">
                <h4>Artista de la semana</h4>
                <img src="img/musica_2.jpg" alt="Artista de la semana">
                <p>Presentacion de zakk Whyle transex</p>
            </div>
        </aside>

    </main>

    <p id="pie_de_pag">Creado po Borja Bolado COMPLETAMENTE RESPONSIVE</p>
</div>

                             <!---foter-->



</div>
</body>
</html>