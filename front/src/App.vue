<template>
  <header-component/>
  <el-container style="height: 100%; border: 1px solid #eee">
    <aside-component/>
    <el-main>
      <router-view/>
    </el-main>
  </el-container>
</template>

<script>
import HeaderComponent from "@/components/HeaderComponent";
import AsideComponent from "@/components/AsideComponent";

export default {
  components: {AsideComponent, HeaderComponent}
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
