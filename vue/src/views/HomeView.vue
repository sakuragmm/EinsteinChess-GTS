<template>
  <div @click="test">
    Home
  </div>
  <button @click="test" title="测试">测试</button>
</template>

<script>
// @ is an alias to /src

import request from "@/utils/request";

export default {
  name: 'HomeView',
  components: {

  },

  methods: {
    test() {
      request.get("/test",).then(res => {
        alert(res.data)
        console.log(res.data)
      })
    }
  }
}
</script>
