
var menuBtn = new Vue({
	el: "#menuBtn",
	methods: {
		show: true,
		test: function(){
			aside.show.display = this.show?"none":""
			main.left.left = this.show?"50px":"194px"
			this.show = !this.show
		}
	}
})

var aside = new Vue({
	el: "#aside",
	data: {
		show: {
			display: ""
		}
	}
})

var main = new Vue({
	el: "#main-container",
	data: {
		left:{
			left: "194px"
		}
	}
})