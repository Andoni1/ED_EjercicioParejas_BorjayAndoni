*{
    padding: 0;
    box-sizing: border-box;
}
body{
    margin: 5%;
    background-color: plum;
}
#contenedor{
    border:1px solid black;
    margin: 5%;
    box-shadow: 4px 4px 4px;
    border-radius: 10px;
    background-color:lightgray;
}
nav{
   
    background-size: cover;
    display: flex;
    align-items: center;
    justify-content: space-around;
    background-image: url(../img/bannerheader.jpg);
     background-repeat: no-repeat;
    height: 15vw;
    width:100%
}
#logo{
    height: 10vw;
    width: 10vw;
    background-image: url(../img/musica_1.jpg);
    background-size: cover;
    background-position: center center;
    border-radius: 50%;
    filter: grayscale(100%);
    -webkit-filter: grayscale(100%);
    -moz-filter: grayscale(100%);
    -ms-filter: grayscale(100%);
    -o-filter: grayscale(100%);
    filter: url(desaturate.svg#greyscale);
    filter: gray;
    -webkit-filter: grayscale(1);
}
h1 {
    text-shadow: black 5px 5px 1px;
    font-size: 3vw;
    text-transform: uppercase;
    color:blue;
    font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
form{
    display: flex;
    flex-direction: column;
    justify-content: space-around;
    align-items: center;
    width: 30% ;
}

form div{
    width: 100%;
    display: flex;
    background-color:rgba(34,34,34,0.8);
    align-items: center;
    justify-content: space-around;
}
 form div p{
   font-size: 1.2vw;
   color:white
}
form div input{
    width: 10vw;
    height: 2vw;
    font-size: 1vw;
}

form div button{

    height: 2vw;
    background-color:black;
    color:white;
    margin:0.3vw;
    width: 5vw;
    border: none;
    font-size:1vw ;
}


/* -----MAIIINN----*/
main{
    display: flex;
    background-color:black;
    width: 100%;
}

#aside_izq{
    display: flex;
    flex-direction: column;
    width:25%;
    background-color:white;
}
#div_main_central{
    margin: 2% 3%;
    width:50%;
    background-color:black;
    color:white;
    text-align: center;
}

#aside_drch{
    display: flex;
    width:25%;
    background-color:white;
    flex-direction: column;
}

.div_izq{
    margin: 5% auto;
    border: 1px solid black;
    box-shadow: 4px 4px 4px;
    width:85%;
}
h4{
    margin-left: 1vw;
    font-size: 1.5vw;
    color: black;
}
#div_lista_izq{
    font-size: 1.2vw;
    width:12vw;
    margin:0 auto;
}



 .div_izq p{
     margin: 3%;
    font-size: 1.2vw;
 }
 .div_izq input{
    width: 12vw;
    height: 2vw;
    font-size: 1.1vw;
    margin: 3%;
 }
 .div_izq button{
    width: 6vw;
    height: 1.7vw;
    font-size: 1vw;
    color:white;
    background-color:black;
    margin: 3%;
    border-radius: 5px;
    border:none;
}


/*aside derechaa*/
.div_drch{
    margin: 5% auto;
    border: 1px solid black;
    box-shadow: 4px 4px 4px;
    width:85%;
}
#div_lista_izq_drch{
    font-size: 1.2vw;
    width:12vw;
    margin:0 auto;
}




 .div_drch p{
     margin: 3%;
    font-size: 1.2vw;
    text-align: center;
 }
 .div_drch img{
     width: 100%;
 }
 #pie_de_pag{
     text-align: center;
 }
aside a:hover{
    color:black;
    text-decoration:underline;
}
#div_main_central video{
    width:90%
}

#div_main_central img {
    width: 30%;
}