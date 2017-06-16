
var menuBtn = new Vue({
	el: "#menuBtn",
	methods: {
		show: true,
		test: function(){
			aside.show.display = this.show?"none":""
			main.left.left = this.show?"10%":"15%"
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


