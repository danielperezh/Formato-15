<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/EBSA_logo.png" class="logo">
    <HelloWorld msg="Formato 15 SUI" />
  </div>
</template>

<script>
import HelloWorld from './components/ExcelUploader.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  }
}
</script>

<style>

.excel-uploader {
  text-align: center; /* Centra el contenido dentro del div */
  margin-top: 40px;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  background-color: #f0f4f8; /* Fondo suave */
  padding: 20px;
  min-height: 100vh; /* Asegura que la página ocupe toda la pantalla */
}

.logo {
  width: 150px; /* Ajusta el tamaño del logo */
  margin-bottom: 20px; /* Espacio entre el logo y el contenido */
}

h1 {
  font-size: 2.5rem;
  color: #3498db;
  margin-bottom: 20px;
}

.file-input {
  display: block; /* Hace que el input ocupe toda la línea */
  margin: 10px auto; /* Centra el input y añade espacio inferior */
  padding: 10px;
  font-size: 1rem;
}

.upload-btn {
  display: block; /* Hace que el botón esté debajo del input */
  background-color: #3498db;
  color: white;
  border: none;
  padding: 10px 20px;
  font-size: 1rem;
  border-radius: 5px;
  margin: 10px auto; /* Añade espacio debajo del botón y lo centra */
  cursor: pointer;
  transition: background-color 0.3s ease;
}

button {
  background-color: #3498db;
  color: white;
  border: none;
  padding: 10px 20px;
  font-size: 1rem;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

button:hover {
  background-color: #2980b9;
}

.download-link {
  display: block;
  margin-top: 20px;
  font-size: 1.2rem;
  color: #2c3e50;
  text-decoration: underline;
}

</style>
