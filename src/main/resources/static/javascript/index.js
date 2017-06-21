
/*var menuBtn = new Vue({
	el: "#menuBtn",
	methods: {
		show: true,
		test: function(){
			aside.show.display = this.show?"none":""
			main.left.left = this.show?"10%":"15%"
			this.show = !this.show
		}
	}
})*/

var aside = new Vue({
	el: "#aside",
	data: {
		show: {
			display: ""
		},
		pageHover: "menu-hover",
		aboutHover: ""
	},
	methods:{
		page: function(){
			this.pageHover = "menu-hover"
			this.aboutHover = ""
			main.left.display = ""
			intro.intro.display = "none"
		},
		about: function(){
			this.pageHover = ""
			this.aboutHover = "menu-hover"
			intro.intro.display = ""
			main.left.display = "none"
		}
	}
})

var intro = new Vue({
	el: "#intro",
	data: {
		intro: {
			display: "none",
			left: "15%"
		}
	}
})

var head = new Vue({
	el: "#head",
	data: {
		headShow: {
			display: ""
		}
	},
	methods: {
		show: true,
		test: function(){
			aside.show.display = this.show?"none":""
			main.left.left = this.show?"10%":"15%"
			intro.intro.left = this.show?"10%":"15%"
			this.show = !this.show
		}
	}
})

