<template>
  <div class="vue-tempalte">
    <form>
      <h3>Sign In</h3>
      <div class="mb-3">
        <label>Email address</label>
        <input type="email" class="form-control form-control-lg" />
      </div>
      <div class="mb-3">
        <label>Password</label>
        <input type="password" class="form-control form-control-lg" />
      </div>
      <button type="submit" class="btn btn-outline-primary btn-block sign-in-button">Sign In</button>
      <p class="forgot-password text-right mt-2 mb-4">
        <router-link to="/forgot-password">Forgot password ?</router-link>
      </p>
      <div class="social-icons">
        <ul>
          <li><a href="#"><i class="fa fa-google"></i></a></li>
          <li><a href="#"><i class="fa fa-facebook"></i></a></li>
          <li><a href="#"><i class="fa fa-twitter"></i></a></li>
        </ul>
      </div>
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
.sign-in-button {
  margin-left: 90px;
  width: 140px;
  color: #2222FF;
}
</style>
