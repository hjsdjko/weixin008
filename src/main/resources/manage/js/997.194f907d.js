(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[997],{51555:(e,t,a)=>{var n=a(88542),l=a(42354),i=a(77849);n({target:"Array",proto:!0},{fill:l}),i("fill")},74997:(e,t,a)=>{"use strict";a.r(t),a.d(t,{default:()=>_});a(10307),a(63134),a(39524);var n=a(67377),l=a(91370),i=a(51290);a(36507),a(51555);function o(){window.innerWidth,window.innerHeight;var e=document.getElementById("canvas");function t(){e.width=window.innerWidth,e.height=window.innerHeight}window.addEventListener("load",t),window.addEventListener("resize",t,!1),t();for(var a=e.getContext("2d"),n=5,l=125,i=60,o=30,r=25,s=.3,u=2.5,d=.6,c=["52,168,83","117,95,147","199,108,23","194,62,55","0,172,212","120,120,120"],h=["52,168,83","117,95,147","199,108,23","194,62,55","0,172,212","120,120,120"],v=10,p=(h[0],.85),g=Math.min(canvas.width,canvas.height)/2.4,f=2.5,m=12,w=[],y=[],b=0;b<2*m;b++)w.push(new C);for(b=0;b<m;b++)y.push(new C(!0));var k=1,_=1.003,M=.997,x=4e-5,S=!1;function C(e){this.background=e||!1,this.x=N(-canvas.width/2,canvas.width/2),this.y=N(-canvas.height/2,canvas.height/2),this.radius=e?$(n,l)*p:$(n,l),this.filled=this.radius<r?!(U(0,100)>i)&&"full":!(U(0,100)>o)&&"concentric",this.color=e?h[U(0,h.length-1)]:c[U(0,c.length-1)],this.borderColor=e?h[U(0,h.length-1)]:c[U(0,c.length-1)],this.opacity=.05,this.speed=e?N(s,u)/p:N(s,u),this.speedAngle=2*Math.random()*Math.PI,this.speedx=Math.cos(this.speedAngle)*this.speed,this.speedy=Math.sin(this.speedAngle)*this.speed;var t=Math.abs((this.x-(this.speedx<0?-1:1)*(canvas.width/2+this.radius))/this.speedx),a=Math.abs((this.y-(this.speedy<0?-1:1)*(canvas.height/2+this.radius))/this.speedy);this.ttl=Math.min(t,a)}function U(e,t){return Math.floor(Math.random()*(t-e+1)+e)}function N(e,t){return Math.random()*(t-e)+e}function $(e,t){return Math.random()*Math.random()*Math.random()*(t-e)+e}function j(e,t){var a=t.background?t.radius*=k:t.radius/=k;e.beginPath(),e.arc(t.x,t.y,a*k,0,2*Math.PI,!1),e.lineWidth=Math.max(1,v*(n-t.radius)/(n-l)),e.strokeStyle=["rgba(",t.borderColor,",",t.opacity,")"].join(""),"full"==t.filled&&(e.fillStyle=["rgba(",t.borderColor,",",t.background?.8*t.opacity:t.opacity,")"].join(""),e.fill(),e.lineWidth=0,e.strokeStyle=["rgba(",t.borderColor,",",0,")"].join("")),e.stroke(),"concentric"==t.filled&&(e.beginPath(),e.arc(t.x,t.y,a/2,0,2*Math.PI,!1),e.lineWidth=Math.max(1,v*(n-t.radius)/(n-l)),e.strokeStyle=["rgba(",t.color,",",t.opacity,")"].join(""),e.stroke()),t.x+=t.speedx,t.y+=t.speedy,t.opacity<(t.background?d:1)&&(t.opacity+=.01),t.ttl--}function W(){window.requestAnimationFrame(H)}function H(){function e(e,t){for(var a=0;a<t.length;a++){var n=t[a];n.ttl;canvas.width,n.radius,canvas.height,n.radius;n.ttl<-20&&t[a].init(t[a].background),j(e,n)}for(a=0;a<t.length-1;a++)for(var l=a+1;l<t.length;l++){var i=t[a].x-t[l].x,o=t[a].y-t[l].y,r=Math.pow(Math.pow(i,2)+Math.pow(o,2),.5);if(!(r<=t[a].radius+t[l].radius)&&r<g){var s=(t[a].x<t[l].x?1:-1)*Math.abs(t[a].radius*i/r),u=(t[a].y<t[l].y?1:-1)*Math.abs(t[a].radius*o/r),d=(t[a].x<t[l].x?-1:1)*Math.abs(t[l].radius*i/r),c=(t[a].y<t[l].y?-1:1)*Math.abs(t[l].radius*o/r);e.beginPath(),e.moveTo(t[a].x+s,t[a].y+u),e.lineTo(t[l].x+d,t[l].y+c);t[a].color,t[l].color;e.strokeStyle=["rgba(",t[a].borderColor,",",Math.min(t[a].opacity,t[l].opacity)*((g-r)/g),")"].join(""),e.lineWidth=(t[a].background?f*p:f)*((g-r)/g),e.stroke()}}}S&&((k<M||k>_)&&(x*=-1),k+=x),a.globalCompositeOperation="destination-over",a.clearRect(0,0,canvas.width,canvas.height),a.save(),a.translate(canvas.width/2,canvas.height/2),e(a,w),a.restore(),window.requestAnimationFrame(H)}C.prototype.init=function(){C.call(this,this.background)},W()}var r=function(e){return(0,n.dD)("data-v-5071b62e"),e=e(),(0,n.Cn)(),e},s=r((function(){return(0,n._)("canvas",{id:"canvas",style:{background:"url(http://clfile.zggen.cn/20231120/5c406dea56f94e7a8862ce254a053b09.jpg) no-repeat center center / cover"}},null,-1)})),u={class:"login_view"},d=r((function(){return(0,n._)("div",{class:"title_view"},"农村事务管理与交流平台登录",-1)})),c={key:0,class:"list_item"},h=r((function(){return(0,n._)("div",{class:"list_label"}," 账号： ",-1)})),v={key:1,class:"list_item"},p=r((function(){return(0,n._)("div",{class:"list_label"}," 密码： ",-1)})),g=["onKeydown"],f={key:2,class:"list_type"},m=r((function(){return(0,n._)("div",{class:"list_label"}," 用户类型： ",-1)})),w={class:"btn_view"};const y={__name:"login",setup:function(e){var t,a=(0,i.iH)([]),r=(0,i.iH)([]),y=(0,i.iH)({role:"",username:"",password:""}),b=(0,i.iH)(""),k=(0,i.iH)(1),_=null===(t=(0,n.FN)())||void 0===t?void 0:t.appContext.config.globalProperties,M=function(){if(y.value.username)if(y.value.password){if(a.value.length>1){if(!y.value.role)return null===_||void 0===_||_.$toolUtil.message("请选择角色","error"),void verifySlider.value.reset();for(var e=0;e<r.value.length;e++)r.value[e].roleName==y.value.role&&(b.value=r.value[e].tableName)}else b.value=a.value[0].tableName,y.value.role=a.value[0].roleName;x()}else null===_||void 0===_||_.$toolUtil.message("请输入密码","error");else null===_||void 0===_||_.$toolUtil.message("请输入用户名","error")},x=function(){null===_||void 0===_||_.$http({url:"".concat(b.value,"/login?username=").concat(y.value.username,"&password=").concat(y.value.password),method:"post"}).then((function(e){null===_||void 0===_||_.$toolUtil.storageSet("Token",e.data.token),null===_||void 0===_||_.$toolUtil.storageSet("role",y.value.role),null===_||void 0===_||_.$toolUtil.storageSet("sessionTable",b.value),null===_||void 0===_||_.$toolUtil.storageSet("adminName",y.value.username),null===_||void 0===_||_.$router.push("/")}),(function(e){}))},S=function(){var e={page:1,limit:1,sort:"id"};null===_||void 0===_||_.$http({url:"menu/list",method:"get",params:e}).then((function(e){r.value=JSON.parse(e.data.data.list[0].menujson);for(var t=0;t<r.value.length;t++)"是"==r.value[t].hasBackLogin&&a.value.push(r.value[t]);y.value.role=a.value[0].roleName,null===_||void 0===_||_.$toolUtil.storageSet("menus",JSON.stringify(r.value))}))},C=function(){S()};return(0,n.bv)((function(){C(),o()})),function(e,t){var i=(0,n.up)("el-option"),o=(0,n.up)("el-select"),r=(0,n.up)("el-button"),b=(0,n.up)("el-form"),_=(0,n.up)("Vcode");return(0,n.wg)(),(0,n.iD)("div",null,[s,(0,n._)("div",u,[(0,n.Wm)(b,{model:y.value,class:"login_form"},{default:(0,n.w5)((function(){return[d,1==k.value?((0,n.wg)(),(0,n.iD)("div",c,[h,(0,n.wy)((0,n._)("input",{class:"list_inp","onUpdate:modelValue":t[0]||(t[0]=function(e){return y.value.username=e}),placeholder:"请输入账号"},null,512),[[l.nr,y.value.username]])])):(0,n.kq)("",!0),1==k.value?((0,n.wg)(),(0,n.iD)("div",v,[p,(0,n.wy)((0,n._)("input",{class:"list_inp","onUpdate:modelValue":t[1]||(t[1]=function(e){return y.value.password=e}),type:"password",placeholder:"请输入密码",onKeydown:(0,l.D2)(M,["enter","native"])},null,40,g),[[l.nr,y.value.password]])])):(0,n.kq)("",!0),a.value.length>1?((0,n.wg)(),(0,n.iD)("div",f,[m,(0,n.Wm)(o,{modelValue:y.value.role,"onUpdate:modelValue":t[2]||(t[2]=function(e){return y.value.role=e}),placeholder:"请选择用户类型"},{default:(0,n.w5)((function(){return[((0,n.wg)(!0),(0,n.iD)(n.HY,null,(0,n.Ko)(a.value,(function(e,t){return(0,n.wg)(),(0,n.j4)(i,{label:e.roleName,value:e.roleName},null,8,["label","value"])})),256))]})),_:1},8,["modelValue"])])):(0,n.kq)("",!0),(0,n._)("div",w,[1==k.value?((0,n.wg)(),(0,n.j4)(r,{key:0,class:"login",type:"success",onClick:M},{default:(0,n.w5)((function(){return[(0,n.Uk)("登录")]})),_:1})):(0,n.kq)("",!0)])]})),_:1},8,["model"])]),(0,n.Wm)(_,{show:e.isShow,onSuccess:e.success,onClose:e.close,onFail:e.fail},null,8,["show","onSuccess","onClose","onFail"])])}}};var b=a(57326);const k=(0,b.Z)(y,[["__scopeId","data-v-5071b62e"]]),_=k}}]);
//# sourceMappingURL=997.194f907d.js.map