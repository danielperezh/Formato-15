<template>
  <div class="excel-uploader">
    <h1>Subir Archivos Excel</h1>
    <input type="file" multiple @change="handleFileUpload" />
    <button @click="uploadFiles">Subir y Unir Archivos</button>
    <a v-if="downloadLink" :href="downloadLink" download="merged.xlsx">Descargar Excel Combinado</a>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      files: [],
      downloadLink: null
    };
  },
  methods: {
    handleFileUpload(event) {
      this.files = Array.from(event.target.files);
    },
    async uploadFiles() {
      const formData = new FormData();
      this.files.forEach((file) => {
        formData.append('files', file);
      });

      try {
        const response = await axios.post('http://localhost:8086/api/excel/upload-merge', formData, {
          responseType: 'blob'
        });
        const url = window.URL.createObjectURL(new Blob([response.data]));
        this.downloadLink = url;
      } catch (error) {
        console.error('Error al subir los archivos:', error);
      }
    }
  }
};
</script>

<style scoped>
.excel-uploader {
  text-align: center;
  margin-top: 50px;
}
button {
  margin-top: 10px;
}
</style>
