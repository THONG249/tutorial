<template>
  <div class="vue-tempalte">
    <form>
      <h3>Sign Up</h3>
      <div class="mb-3">
        <label>Full Name</label>
        <input type="text" class="form-control form-control-lg" />
      </div>
      <div class="mb-3">
        <label>Email address</label>
        <input type="email" class="form-control form-control-lg" />
      </div>
      <div class="mb-3">
        <label>Password</label>
        <input type="password" class="form-control form-control-lg" />
      </div>
      <button type="submit" class="btn btn-outline-primary btn-block sign-in">Sign Up</button>
      <p class="forgot-password text-right">
        Already registered
        <router-link :to="{ name: 'login' }">sign in?</router-link>
      </p>
    </form>
  </div>
</template>
<script>
export default {
  data() {
    return {}
  }
}
</script>
<style>
.sign-in {
  margin-left: 90px;
  width: 150px;
  color: #2222FF;
}
</style>
