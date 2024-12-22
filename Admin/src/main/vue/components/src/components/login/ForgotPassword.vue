<template>
  <div class="vue-tempalte">
    <form>
      <h3>Forgot Password</h3>
      <div class="mb-3">
        <label>Email address</label>
        <input type="email" class="form-control form-control-lg" />
      </div>
      <button type="submit" class="btn btn-outline-primary btn-block reset-pass">Reset password</button>
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
.reset-pass {
  margin-left: 101px;
  width: 140px;
  color: #2222FF;
}
</style>
