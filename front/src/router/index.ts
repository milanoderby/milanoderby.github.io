import { createRouter, createWebHistory, RouteRecordRaw } from "vue-router";
import Home from "../views/Home.vue";

const routes: Array<RouteRecordRaw> = [
  {
    path: "/home",
    name: "Home",
    component: Home,
  },
  // {
  //   path: "/",
  //   name: "Main",
  //   component: () =>
  //       import(/* webpackChunkName: "about" */ "@/views/Main.vue"),
  // },
  {
    path: "/editor",
    name: "TuiEditor",
    component: () =>
      import(/* webpackChunkName: "about" */ "@/views/TuiEditor.vue"),
  },
  {
    path: "/",
    name: "TuiViewer",
    component: () =>
      import(/* webpackChunkName: "about" */ "@/views/TuiViewer.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
