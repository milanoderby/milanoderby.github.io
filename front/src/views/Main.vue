<template>
  <el-main> </el-main>
</template>

<script lang="ts">
import { Options, Vue } from "vue-class-component";

@Options({})
export default class Main extends Vue {}
</script>

<style>
.el-header {
  background-color: white;
  color: #333;
  line-height: 60px;
}

.el-aside {
  color: #333;
}
</style>
