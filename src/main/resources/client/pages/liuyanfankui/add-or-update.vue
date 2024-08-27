<template>
<view class="content">
	<view :style='{"width":"100%","padding":"0 0 0 0","position":"relative","background":"#ffffff","height":"100%"}'>
		<form :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","background":"#ffffff","display":"block","height":"auto"}' class="app-update-pv">
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">用户账号</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">用户姓名</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.yonghuxingming" v-model="ruleForm.yonghuxingming" placeholder="用户姓名"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">反馈标题</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' :disabled="ro.fankuibiaoti" v-model="ruleForm.fankuibiaoti" placeholder="反馈标题"></input>
			</view>
			<view :style='{"padding":"4rpx 0 4rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderWidth":"0 0 2rpx 0","background":"#ffffff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">反馈时间</view>
				<input :style='{"border":"0px solid #eeeeee","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"8rpx","flex":"1","background":"#ffffff00","fontSize":"28rpx","lineHeight":"80rpx","height":"80rpx"}' v-model="ruleForm.fankuishijian" placeholder="反馈时间" @tap="toggleTab('fankuishijian')"></input>
			</view>
			
			<!-- 否 -->
 

			
			<view :style='{"padding":"12rpx 0 12rpx 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","borderWidth":"0 0 2rpx 0","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","fontWeight":"500"}' class="title">反馈内容</view>
                <xia-editor ref="editor" :style='{"minHeight":"300rpx","border":"0px solid #efefef","padding":"0px","color":"#666666","borderRadius":"8rpx 0 0 8rpx","background":"#ffffff","width":"100%","height":"auto"}' v-model="ruleForm.fankuineirong" placeholder="反馈内容" @editorChange="fankuineirongChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0px solid #eeeeee","padding":"0 0 0 0","margin":"0 4% 0 0","color":"#ffffff","background":"#1D5DCA","width":"30%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="fankuishijianConfirm" ref="fankuishijian" themeColor="#333333"></w-picker>
	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
    import xiaEditor from '@/components/xia-editor/xia-editor';
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				yonghuzhanghao: '',
				yonghuxingming: '',
				fankuibiaoti: '',
				fankuineirong: '',
				fankuishijian: '',
			        sfsh: '待审核',
				shhf: '',
				},
				// 登录用户信息
				user: {},
                ro:{
                   yonghuzhanghao : false,
                   yonghuxingming : false,
                   fankuibiaoti : false,
                   fankuineirong : false,
                   fankuishijian : false,
                   sfsh : false,
                   shhf : false,
                },
			}
		},
		components: {
			wPicker,
            xiaEditor,
            multipleSelect
		},
		watch:{
		},
		async onLoad(options) {
            this.ruleForm.fankuishijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.yonghuxingming = this.user.yonghuxingming
			this.ro.yonghuxingming = true;



			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`liuyanfankui`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='yonghuzhanghao'){
					this.ruleForm.yonghuzhanghao = obj[o];
					this.ro.yonghuzhanghao = true;
					continue;
					}
					if(o=='yonghuxingming'){
					this.ruleForm.yonghuxingming = obj[o];
					this.ro.yonghuxingming = true;
					continue;
					}
					if(o=='fankuibiaoti'){
					this.ruleForm.fankuibiaoti = obj[o];
					this.ro.fankuibiaoti = true;
					continue;
					}
					if(o=='fankuineirong'){
					this.ruleForm.fankuineirong = obj[o];
					this.ro.fankuineirong = true;
					continue;
					}
					if(o=='fankuishijian'){
					this.ruleForm.fankuishijian = obj[o];
					this.ro.fankuishijian = true;
					continue;
					}
				}
			}
			this.styleChange()
            this.$forceUpdate()
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		methods: {
            fankuineirongChange(e) {
                this.ruleForm.fankuineirong = e
            },
			styleChange() {
				this.$nextTick(()=>{
					document.querySelectorAll('.radioText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.radioTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#1D5DCA"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#1D5DCA"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #999999","borderRadius":"100%","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #1D5DCA","borderRadius":"100%","background":"#1D5DCA"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #999999","borderRadius":"100%","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #1D5DCA","color":"#ffffff","borderRadius":"100%","background":"#1D5DCA"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
				})
			},

			// 多级联动参数

			// 日长控件选择日期时间
			fankuishijianConfirm(val) {
				console.log(val)
				this.ruleForm.fankuishijian = val.result;
				this.$forceUpdate();
			},



			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {















//跨表计算判断
				var obj;
				if((!this.ruleForm.fankuibiaoti)){
					this.$utils.msg(`反馈标题不能为空`);
					return
				}
				if((!this.ruleForm.fankuineirong)){
					this.$utils.msg(`反馈内容不能为空`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
                    uni.setStorageSync('crossCleanType',true);
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
                        if(!obj) {
						    obj = uni.getStorageSync('crossObj');
                        }
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`liuyanfankui`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
                        uni.removeStorageSync('crossCleanType');
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`liuyanfankui`, this.ruleForm);
						}else{
							await this.$api.add(`liuyanfankui`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`liuyanfankui`, this.ruleForm);
					}else{
						await this.$api.add(`liuyanfankui`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
