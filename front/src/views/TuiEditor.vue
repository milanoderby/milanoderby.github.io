<template>
  <div id="editor"></div>
</template>
<script lang="ts">
import { Options, Vue } from "vue-class-component";
import { Editor } from "@toast-ui/editor";
import "@toast-ui/editor/dist/toastui-editor.css";

@Options({
  name: "tui-editor-component",
  mounted() {
    const editor = new Editor({
      el: document.getElementById("editor")!,
      height: "500px",
      initialEditType: "markdown",
      previewStyle: "vertical",
      usageStatistics: false,
    });
  },
})
export default class TuiEditor extends Vue {}
</script>
<style scoped>
#editor {
  width: 100%;
}
</style>
