<template>
  <el-header class="header">
    <div class="header-menu">
      <span>Mad Coder, Special One</span>
    </div>
    <div class="header-center"></div>
    <div class="header-menu">
      <el-button type="primary" icon="el-icon-search" circle></el-button>
      <el-button type="text" class="menu-text">Tags</el-button>
      <el-button type="text" class="menu-text">Login</el-button>
    </div>
    <div class="header-right">
      <el-button type="primary" icon="el-icon-s-unfold"></el-button>
    </div>
  </el-header>
</template>
<script>
export default {
  name: "header-component",
};
</script>
<style scoped>
.header {
  height: 70px;

  padding: 0;

  font-size: 20px;

  display: flex;
  align-items: center;
}

.header-menu {
  color: var(--el-color-primary);
  margin: 0 20px;
}

.header-menu > span,
.header-menu .menu-text {
  font-size: 20px;
}

.header-center {
  flex: 1;
}

.header-right {
  width: 160px;
  padding: 0 20px;

  display: flex;
  justify-content: center;
  align-items: center;
}

.header-right > button {
  font-size: 20px;
}
</style>
