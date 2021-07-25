<template>
  <div id="editor">
    ## 안녕 세상
  </div>
</template>
<script lang="ts">
  import { Options, Vue } from "vue-class-component";
  import Editor from '@toast-ui/editor';
  import '@toast-ui/editor/dist/toastui-editor.css';

  @Options({
    name: 'tui-viewer-component',
    mounted() {
      const editor = new Editor({
        el: document.getElementById('editor')!,
        height: '500px',
        initialEditType: 'markdown',
        previewStyle: 'vertical'
      });
    }
  })
  export default class TuiViewer extends Vue {}
</script>
<style>



</style>