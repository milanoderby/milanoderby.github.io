<template>
  <div id="editor">
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
        height: 'auto',
        initialEditType: 'markdown',
        initialValue: '# Hello World',
        previewStyle: 'vertical',
        usageStatistics: false
      });

      editor.getMarkdown();
    }
  })
  export default class TuiViewer extends Vue {}
</script>
<style>
#editor {
  width: 100%;
}
</style>