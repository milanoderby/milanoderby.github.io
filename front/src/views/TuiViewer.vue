<template>
  <div id="viewer"></div>
</template>
<script>
import { Options, Vue } from "vue-class-component";
import Viewer from "@toast-ui/editor/dist/toastui-editor-viewer";
import "@toast-ui/editor/dist/toastui-editor.css";

@Options({
  name: "tui-viewer-component",
  mounted() {
    const viewer = new Viewer({
      el: document.getElementById("viewer"),
      initialValue: "# hello",
      height: "500px",
      usageStatistics: false,
    });
  },
})
export default class TuiViewer extends Vue {}
</script>
<style scoped>
#viewer {
  width: 100%;
}
</style>
