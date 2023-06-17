<html lang="en"><head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Membresias</title>
  <link rel="shortcut icon" href="assets/img/animales.png" type="image/x-icon">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
  <link rel="stylesheet" href="assets/css/membresia.css">
  <link rel="stylesheet" href="assets/css/main.css">
</head>

<body class="is-preload">
  <nav id="nav" class="nav2">
    <ul class="links">
      <li class="active"><a href="index.html">Safe Pet </a></li>
      <li><a href="#">Contactos</a></li>
      <li><a href="#">Alianzas</a></li>
      <li><a href="#">Nosotros</a></li>
      <li><a href="#">Eventos</a></li>
      <li><a href="#">Membresias</a></li>
    </ul>
    <ul class="icons">
      <li><a href="#" class="icon brands fa-twitter"><span class="label">Twitter</span></a></li>
      <li><a href="#" class="icon brands fa-facebook-f"><span class="label">Facebook</span></a></li>
      <li><a href="#" class="icon brands fa-instagram"><span class="label">Instagram</span></a></li>
      <li><a href="#" class="fa-solid fa-user"><span class="label"></span></a></li>
    </ul>
  </nav>
  <div class="slider" x-data="{start: true, end: false}" style="padding-top: 150px;">
    <div class="slider__content" x-ref="slider" x-on:scroll.debounce="$refs.slider.scrollLeft == 0 ? start = true : start = false; Math.abs(($refs.slider.scrollWidth - $refs.slider.offsetWidth) - $refs.slider.scrollLeft) < 5 ? end = true : end = false;">
      <div class="slider__item">
        <img class="slider__image" src="assets/img/fondo-mem.jpg" alt="Image">
        <div class="slider__info">
          <h2>membresia $10</h2>
          <div class="container">
          <p>Incluir Veterinarias y/o Fundaciones a la página <img src="assets/img/comprobado.png" alt="" width="20px"></p>
        </div>
          <div class="d-grid gap-2 col-6 mx-auto">
            <button style="background-color: aliceblue;" type="button">Comprar</button>
          </div>
        </div>
      </div>
      <div class="slider__item">
        <img class="slider__image" src="assets/img/fondo-mem.jpg" alt="Image">
        <div class="slider__info">
          <h2>membresia $15</h2>
          <div class="container">
          <p>Mejora del posicionamiento en la página <img src="assets/img/comprobado.png" alt="" width="20px"></p>
          <p>Incluir Veterinarias y/o Fundaciones a la página <img src="assets/img/comprobado.png" alt="" width="20px"></p>
        </div>
          <div class="d-grid gap-2 col-6 mx-auto">
            <button class="align-items-end" style="background-color: aliceblue;" type="button">Comprar</button>
          </div>
        </div>
      </div>
      <div class="slider__item">
        <img class="slider__image" src="assets/img/fondo-mem.jpg" alt="Image">
        <div class="slider__info">
          <h2>membresia $25</h2>
          <div class="container">
          <p>Mejora del posicionamiento en la página <img src="assets/img/comprobado.png" alt="" width="20px"></p>
          <p>Incluir Veterinarias y/o Fundaciones a la página <img src="assets/img/comprobado.png" alt="" width="20px"></p>
          <p>Acceso a contenido exclusivo <img src="assets/img/comprobado.png" alt="" width="20px"></p>
          <p>Acceso a funciones específicas dentro de la página (Mapas, redirecciones a sitios) <img src="assets/img/comprobado.png" alt="" width="20px"></p>
        </div>
          <div class="d-grid gap-2 col-6 mx-auto">
            <button style="background-color: aliceblue;" type="button">Comprar</button>
          </div>
        </div>
      </div>
    </div>
  </div>
  

  <footer id="footer" class="memb mt-5">
    <section class="split contact align-items-center">
      <section>
        <h3>Social</h3>
        <ul class="icons alt">
          <li><a href="#" class="icon brands alt fa-twitter"><span class="label">Twitter</span></a></li>
          <li><a href="#" class="icon brands alt fa-facebook-f"><span class="label">Facebook</span></a>
          </li>
          <li><a href="#" class="icon brands alt fa-instagram"><span class="label">Instagram</span></a>
          </li>
        </ul>
      </section>
    </section>
  </footer>

  <!-- Copyright -->
  <div id="copyright" class="cop">
    <ul>
      <li>© Copyright</li>
      <li>Design: <a href="#">#</a></li>
    </ul>
  </div>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/alpinejs/3.10.2/cdn.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
  <script src="assets/js/membresiabutton.js"></script>


</body></html>