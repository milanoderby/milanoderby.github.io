<template>
  <el-header class="header">
    <div class="header-left">
      <el-button><i class="el-icon-s-unfold"></i></el-button>
    </div>
    <div class="header-menu">
      <span>Mad Coder</span>
    </div>
    <div class="header-menu">
      <el-button type="text">Tags</el-button>
      <el-button type="text">Login</el-button>
      <el-button type="primary" icon="el-icon-search" circle></el-button>
    </div>
  </el-header>
</template>
<script>
export default {
  name: 'header-component'
}
</script>
<style scoped>
.header {
  height: 70px;

  padding: 0;

  font-size: 20px;

  display: flex;
  align-items: center;
}

.header-left {
  width: 160px;
  padding: 0 20px;
}

.header-menu {
  color: var(--el-color-primary);
  flex: 1;
}

.header-menu > span, .header-menu > button {
  font-size: 20px;
}

el-button {
  text-align: right;
  font-size: 12px;
}

.el-icon-s-unfold {
  color: var(--el-color-primary);
  font-size: 20px;
}
</style>