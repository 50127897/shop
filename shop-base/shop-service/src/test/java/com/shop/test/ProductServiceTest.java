//package com.shop.test;
//
//import static org.junit.Assert.fail;
//
//import java.math.BigDecimal;
//import java.util.Date;
//import java.util.List;
//import java.util.Random;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.shop.pojo.ImageProduct;
//import com.shop.pojo.Product;
//import com.shop.pojo.ProductSpec;
//import com.shop.service.BrandsService;
//import com.shop.service.CategoryService;
//import com.shop.service.ImageProductService;
//import com.shop.service.ProductService;
//import com.shop.service.StockBackStageService;
//import com.shop.utils.UUIDUtil;
//
///**
// * @ClassName: ProductServiceTest
// * @author: snypxk
// * @Description: 商品表（product）的服务测试类
// * @date: 2019年8月2日
// * @Other:
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext_*.xml")
//public class ProductServiceTest {
//
//	@Autowired
//	private ProductService productService;
//
//	@Autowired
//	private BrandsService brandsService;
//
//	@Autowired
//	private CategoryService categoryService;
//
//	@Autowired
//	private ImageProductService imageProductService;
//	
//	@Autowired
//	private StockBackStageService stockBackStageService;
//
//	@Test
//	public void test() {
//		System.out.println("test the junit is working.....");
//		// 为5张图片命名
//
//		for (int i = 1; i < 10; i++) {
//			System.out.print(UUIDUtil.get16UUID() + "    ");
//			if (i % 5 == 0) {
//				System.out.println();
//				System.out.println();
//			}
//			if (i % 25 == 0) {
//				System.out.println("<<第 " + i / 25
//						+ " 份数据完>>       一份数据可以给5个商品命名它的图片  一个商品用一行共5个数据 给其 5张图片重命名  注意: 一定不能重复使用同一行数据");
//				System.out.println();
//				System.out.println();
//			}
//		}
//
//	}
//
//	@Test
//	public void testsomething() {
//
//String pname[] = {
//"运动鞋Air Max270 React",
//"男子跑步鞋Zoom Fly 3",
//"男子运动鞋Nike Zoom 2K",
//"男子篮球鞋Zoom KD12 EP",
//"训练鞋Air Max Alpha",
//"运动鞋Air Max2 Light",
//"跑步鞋React Flyknit 2",
//"篮球鞋Zero Gravity PF",
//"男子运动鞋Nike Shox R4",
//"男子跑步鞋Joyride Run FK",
//"运动鞋Force 1 '07 LV8 3",
//"跑步鞋Legend React 2",
//"运动鞋Element PRM SU19",
//"网球鞋Air Max Wildcard",
//"滑板鞋SB Zoom Low GT",
//"运动鞋Air VaporMax 3",
//"运动鞋Zoom Vomero 5 SP",
//"运动鞋React Element 55",
//"运动鞋ACG Dog Mountain",
//"运动鞋Nike Air Max 98",
//"运动鞋Nike Air Flyknit 3",
//"运动鞋Air Max 270 React",
//"女子跑步鞋Joyride Run FK",
//"女子运动鞋Nike P-6000",
//"运动鞋Zoom X Vista Grind",
//"跑步鞋Epic Flyknit 2",
//"运动鞋Nike Blazer Low LE",
//"跑步鞋Epic Phantom React",
//"训练鞋Motion Trainer",
//"运动鞋React Element 55",
//"女子跑步鞋Zoom Fly FK",
//"女子运动鞋Royale Acslpse",
//"女子运动鞋Air Max Oketo",
//"足球鞋Vapor 12 FG/MG",
//"运动鞋Air 1 RET Low Slip",
//"运动童鞋Pico 5 (PSV)",
//"运动童鞋Air Max 200 (GS)",
//"运动童鞋Air Max 200 (PS)",
//"大童运动童鞋Pico 5 (GS)",
//"运动童鞋Renew Lucent",
//"婴童运动童鞋Pico 5 (TDV)",
//"幼童运动童鞋Novice (PS)",
//"运动童鞋Nitroflo (GS)",
//"篮球童鞋Flight 2 (GS)",
//"运动童鞋Air Max 720 (GS)",
//"跑步童鞋Future Speed 2",
//"运动童鞋Runner 2 (TDV)",
//"跑步童鞋Star Runner 2",
//"运动童鞋Jordan 4 Retro",
//"运动童鞋Huarache G.E.BG"
//
//};
//
//
//String cname[] = {"耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克"
//};
//
//
//String category[] ={"man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid"
//};
//
//
//double shopprice[] = {1199,1169,699,1299,799,899,1299,559,1299,1399,799,799,949,649,629,1119,1199,899,799,839,1199,1199,1399,799,1299,1299,599,1129,449,899,819,499,419,419,749,329,769,599,399,569,299,469,599,569,1169,569,299,399,699,539};
//
//
//double marketprice[] = {1300,1205,728,1388,851,955,1389,576,1450,1508,854,829,998,672,651,1254,1351,957,839,855,1354,1301,1507,880,1507,1489,721,1209,489,1009,951,618,451,509,819,399,915,749,507,609,351,509,730,675,1307,589,341,527,818,769};
//String pdesc[] ={
//"柔软缓震设计，缔造舒适穿着体验",
//"提供强劲推力，助你一路畅跑",
//"橡胶鞋翼从外底两侧包覆至鞋面",
//"缓震创新技术，轻松驾驭整场比赛",
//"Max Air 缓震配置提供舒适感受。",
//"柔软泡棉打造舒适的日常穿着体验",
//"灵敏响应的性能，成就非凡表现力",
//"轻盈鞋面有助稳定双足且舒适贴合",
//"融入穿孔设计，帮助双足保持凉爽",
//"足底部分贴合足型，助力畅跑",
//"大胆配色，塑就时尚外观。",
//"泡棉塑就出众稳定性和缓震效果",
//"泡棉弹性出众，塑就前沿造型",
//"Max Air 气垫，塑就缓震迈步体验",
//"具响应灵敏的轻盈缓震性能",
//"带来弹力充沛的迈步体验",
//"妥帖包覆足部，提供透气支撑效果",
//"Nike React 技术，焕新经典格调",
//"泡棉缓震配置，塑就舒适穿着体验",
//"缓震系统和利落线条设计惊艳亮相",
//"水纹形线条、反光滚边和缓震配置",
//"柔软缓震设计令你犹在云端",
//"足底部分贴合足型，助力畅跑全程",
//"透气网眼布再现千禧年代的跑鞋风格",
//"叛逆与优雅的新奇碰撞彰显出众强大",
//"具备轻盈平滑性能和醒目外观",
//"优质外观和舒适感受，展现篮球风范",
//"一脚蹬款式设计，方便轻松穿上",
//"搭配弹性固定带，实现多向抓地力",
//"Nike React技术打造，焕新经典格调",
//"鞋面宛如手套般轻盈且富有支撑力",
//"出众风范和舒适感受营造经典风格",
//"采用简约设计，塑就舒适缓震性能",
//"两片式外底系统，实现推进抓地力",
//"便捷按扣，塑就舒适的出行体验",
//"稳固贴合，抓地力出众",
//"波纹线条灵感来自流动岩浆波纹",
//"采用弹性鞋带设计，方便鞋款穿脱",
//"以耐穿材料制成，易于穿脱",
//"柔软泡棉缓震配置，造就舒适体验",
//"稳固贴合，抓地力出众。易于穿脱",
//"一脚蹬款式设计让孩子乐享玩耍体验",
//"将舒适性和耐穿性合二为一",
//"缓震性能柔软，助你畅享舒适体验",
//"从地质奇观中汲取灵感，彰显优雅格调",
//"轻盈非凡，助你快速冲过终点线",
//"易于穿脱，可像巨星般嬉戏玩耍",
//"轻盈耐穿，缔造非凡舒适感受",
//"柔软泡棉缓震配置，非凡舒适",
//"弹性材料，妥善包覆双足，舒适贴合"
//};
//
//String psearch[] ={
//"耐克-男-绿-休闲-运动鞋Air Max270 React-en-ar",
//"耐克-男-绿-跑步-男子跑步鞋Zoom Fly 3-en-ru",
//"耐克-男-红-休闲-男子运动鞋Nike Zoom 2K-re-ar",
//"耐克-男-红-篮球-男子篮球鞋Zoom KD12 EP-re-ba",
//"耐克-男-黄-篮球-训练鞋Air Max Alpha-ye-ba",
//"耐克-男-黄-跑步-运动鞋Air Max2 Light-ye-ru",
//"耐克-男-棕-跑步-跑步鞋React Flyknit 2-br-ru",
//"耐克-男-棕-篮球-篮球鞋Zero Gravity PF-br-ba",
//"耐克-男-紫-跑步-男子运动鞋Nike Shox R4-pu-ru",
//"耐克-男-紫-跑步-男子跑步鞋Joyride Run FK-pu-ru",
//"耐克-男-蓝-篮球-运动鞋Force 1 '07 LV8 3-ue-ba",
//"耐克-男-蓝-跑步-跑步鞋Legend React 2-ue-ru",
//"耐克-男-黑-足球-运动鞋Element PRM SU19-ack-fo",
//"耐克-男-黑-休闲-网球鞋Air Max Wildcard-ack-ar",
//"耐克-男-黑-休闲-滑板鞋SB Zoom Low GT-ack-ar",
//"耐克-男-黑-跑步-运动鞋Air VaporMax 3-ack-ru",
//"耐克-男-灰-休闲-运动鞋Zoom Vomero 5 SP-gr-ar",
//"耐克-男-灰-跑步-运动鞋React Element 55-gr-ru",
//"耐克-男-青-休闲-运动鞋ACG Dog Mountain-cyan-ar",
//"耐克-男-橙-跑步-运动鞋Nike Air Max 98-or-ru",
//"耐克-女-绿-跑步-运动鞋Nike Air Flyknit 3-en-ru",
//"耐克-女-绿-休闲-运动鞋Air Max 270 React-en-ar",
//"耐克-女-红-跑步-女子跑步鞋Joyride Run FK-re-ru",
//"耐克-女-红-休闲-女子运动鞋Nike P-6000-re-ar",
//"耐克-女-黄-休闲-运动鞋Zoom X Vista Grind-ye-ar",
//"耐克-女-黄-跑步-跑步鞋Epic Flyknit 2-ye-ru",
//"耐克-女-棕-休闲-运动鞋Nike Blazer Low LE-br-ar",
//"耐克-女-棕-跑步-跑步鞋Epic Phantom React-br-ru",
//"耐克-女-紫-足球-训练鞋Motion Trainer-pu-fo",
//"耐克-女-紫-足球-运动鞋React Element 55-pu-fo",
//"耐克-女-蓝-跑步-女子跑步鞋Zoom Fly FK-ue-ru",
//"耐克-女-蓝-足球-女子运动鞋Royale Acslpse-ue-fo",
//"耐克-女-黑-休闲-女子运动鞋Air Max Oketo-ack-ar",
//"耐克-女-青-足球-足球鞋Vapor 12 FG/MG-cyan-fo",
//"耐克-女-橙-篮球-运动鞋Air 1 RET Low Slip-or-ba",
//"耐克-儿童-绿-跑步-运动童鞋Pico 5 (PSV)-en-ru",
//"耐克-儿童-绿-篮球-运动童鞋Air Max 200 (GS)-en-ba",
//"耐克-儿童-红-篮球-运动童鞋Air Max 200 (PS)-re-ba",
//"耐克-儿童-红-跑步-大童运动童鞋Pico 5 (GS)-re-ru",
//"耐克-儿童-黄-篮球-运动童鞋Renew Lucent-ye-ba",
//"耐克-儿童-黄-休闲-婴童运动童鞋Pico 5 (TDV)-ye-ar",
//"耐克-儿童-棕-休闲-幼童运动童鞋Novice (PS)-br-ar",
//"耐克-儿童-棕-篮球-运动童鞋Nitroflo (GS)-br-ba",
//"耐克-儿童-蓝-篮球-篮球童鞋Flight 2 (GS)-ue-ba",
//"耐克-儿童-蓝-休闲-运动童鞋Air Max 720 (GS)-ue-ar",
//"耐克-儿童-灰-跑步-跑步童鞋Future Speed 2-gr-ru",
//"耐克-儿童-灰-休闲-运动童鞋Runner 2 (TDV)-gr-ar",
//"耐克-儿童-青-跑步-跑步童鞋Star Runner 2-cyan-ru",
//"耐克-儿童-橙-休闲-运动童鞋Jordan 4 Retro-or-ar",
//"耐克-儿童-橙-跑步-运动童鞋Huarache G.E.BG-or-ru"
//
//};
//
//String ipRouteList[][] = {
//{"e175f2803d614030.jpg","971ba3547e0e400f.jpg","0f9ad15992cd4d15.jpg","08170bee2e044038.jpg","8abf3ec4ac8646ee.jpg"},
//{"3516bc584ae94c22.jpg","4054a0a47ac4469c.jpg","0d6af08dc96e442c.jpg","b96a0e01b36e4f55.jpg","da861bd9b56f4f95.jpg"},
//{"b80212aa8d554455.jpg","bfbf3c21bfb6447f.jpg","8daa386cdd6c4443.jpg","5dc4992883f54e71.jpg","33b4f9fcce25448e.jpg"},
//{"514954dd97d24add.jpg","f9d16d6e48284fd1.jpg","57621b0ec6114ef8.jpg","54c4065421c343e3.jpg","1aa12f0b77334c54.jpg"},
//{"eeca43ffced14946.jpg","76ea78fed63c4267.jpg","10ff5bb6ed01416d.jpg","af18a8e111cd40cc.jpg","098c971fea034345.jpg"},
//
//{"4cd00f7e493e46e9.jpg","1226f56740af40cd.jpg","7b36ebbeefa74121.jpg","c45fb1a9dd5a4001.jpg","e4549a5df7af40ed.jpg"},
//{"fbf4ee82f8ef4b13.jpg","b683e3ad14b44c55.jpg","44e1afb2211b4186.jpg","73c5874d811842d4.jpg","9a914809e98b4d1f.jpg"},
//{"a19571242e554971.jpg","db1351747b2d4803.jpg","8ba45072692b42c0.jpg","e29f009dba524d71.jpg","84979e651a5442b2.jpg"},
//{"0779c07055324135.jpg","40994decccf74533.jpg","e53289a275cd4517.jpg","4b90fd33045647ba.jpg","1b6493e864484d12.jpg"},
//{"4387d92a01144cb2.jpg","cfdd60d22e1c49ce.jpg","1f644752126143a8.jpg","06825bea90724cff.jpg","7bbacb279c694c82.jpg"},
//
//{"908156a434394ce2.jpg","96f5f8fbcbfa4f4c.jpg","b2caad63299845e5.jpg","b30b045ccff84ec9.jpg","ee62549fc05d4a95.jpg"},
//{"32b67384c5b748eb.jpg","e6f65510468f491a.jpg","a1182ea0dd6d458d.jpg","261303ddd1f94111.jpg","e28af5e9ac574e3c.jpg"},
//{"2c7706f09d3b47e6.jpg","0fcaab47d13c4e89.jpg","e7b3bacecd84417f.jpg","7e4f4ed51db84fbf.jpg","2cc6c31964794bf0.jpg"},
//{"83d38362fcad4d23.jpg","8cbfbed64c544f63.jpg","adbc226990a94a70.jpg","f498612e7b3d4962.jpg","94bc639d801144a5.jpg"},
//{"4c92aa5d722c44f2.jpg","8474fa1dff224777.jpg","c6d7dbab043d40e4.jpg","644b4bc9fd7647d5.jpg","c08dfcfc8cb64f3f.jpg"},
//
//{"b2b4d57811004e7b.jpg","5186aa16778c47d7.jpg","8aa9a27ca3bf4feb.jpg","05614080d8cf45bb.jpg","0e7121ea958e44dc.jpg"},
//{"d7cf3747bbf94b6d.jpg","f15b96ee3be04fc9.jpg","411eac689e404da4.jpg","1dffce6015a34ad5.jpg","7ae87a21c1c54256.jpg"},
//{"f380524aac344fd5.jpg","fd92143259034b09.jpg","efa316e814884853.jpg","7880666756594b64.jpg","4c5994bccad541f2.jpg"},
//{"05950aca703149b0.jpg","e6b5ec70c35b4763.jpg","25e021bbfb81454a.jpg","141d5e3696c345c8.jpg","b6f4717218ee460e.jpg"},
//{"7d8bed8a77824542.jpg","698d74698cd84c9c.jpg","5c0577fbe7de48e2.jpg","026111d01b074294.jpg","83c16ab1b58540a1.jpg"},
//
//{"d60b46ddd29e4164.jpg","20bebd67943148df.jpg","daca50aa314d4841.jpg","3da6f2497c544949.jpg","b0212ecd73944644.jpg"},
//{"12c98a1308914fa2.jpg","f7df82d4e1b34faf.jpg","47a2054c40284e65.jpg","5170ea21528148a6.jpg","cd62a8475ff4445e.jpg"},
//{"9dab48df888e4005.jpg","41e18d8f7d3b4264.jpg","308d1ecb8f8d4d5a.jpg","6efbb93f28e4410e.jpg","77180d658ff641d1.jpg"},
//{"603d9e54ee754255.jpg","391c6dcc8eca4639.jpg","3c214be624164574.jpg","a9f2bbbda760477c.jpg","26b795dd71f346bc.jpg"},
//{"7b64d2aaa8bf41d5.jpg","70e272d35a77424c.jpg","50c6abc7565c463f.jpg","8cada793ce5c4e63.jpg","c802d36796714fbe.jpg"},
//
//{"06cfb8fb029f4453.jpg","8ed96d7adf5142bc.jpg","5c34da5316414222.jpg","ab3b9da68aa9484e.jpg","7946d77c09a24f8e.jpg"},
//{"9394b2a30f0645ec.jpg","f30ecd774b30407f.jpg","12655008f5ca427b.jpg","c58436979b0f4702.jpg","ad6565a101614808.jpg"},
//{"957067feb8ae4b9d.jpg","2b3e421c0aa34557.jpg","8287c05895b04298.jpg","f0294864f1434824.jpg","f3afd9cd860a4ad2.jpg"},
//{"508506faea2e4abd.jpg","fcd4505125a142cd.jpg","551b49320717425d.jpg","6ec6e70551c54cd4.jpg","f0f702ecb9b34d6d.jpg"},
//{"396cbef116354655.jpg","836a155086c149c1.jpg","5614f3b27ecf4bd0.jpg","1b59dc60e5614c6b.jpg","12dd30e8c4a04de0.jpg"},
//
//{"e4823c745a264089.jpg","a54d9f1d1a7047e4.jpg","3a4d56216a8e4288.jpg","fd834587b6744078.jpg","2137b8715a4b4676.jpg"},
//{"3dba25e8721d4ceb.jpg","e0b099e202d04abd.jpg","e60d9ed13b264e52.jpg","a08bce5bfe5c4de6.jpg","90cf438202ec4c43.jpg"},
//{"6ae73fbbce3e440a.jpg","b881ef793796441b.jpg","99605e0c4c904369.jpg","2832683d55c24215.jpg","53ea3373df804d99.jpg"},
//{"36e14a31ad784e3c.jpg","0378420943114a64.jpg","96ba6e7422344d88.jpg","2a6a38ac48124d11.jpg","2c3cbb6ce009494b.jpg"},
//{"d4135f5b2bad4a9f.jpg","012cae1d36cf4920.jpg","7f813033567f4838.jpg","2f7d2d345ab9470d.jpg","a83b225ef48b421d.jpg"},
//
//{"ab5f9c63c13d4a1e.jpg","45036cb99dd541bb.jpg","1aa0e50c4cde4790.jpg","eb79aa5252cf4a8c.jpg","a2369ebf95614a23.jpg"},
//{"b0f669937e614a24.jpg","8819eaaf81604444.jpg","e10f9cb46af54cd9.jpg","430503a102f844be.jpg","a055322a3f574338.jpg"},
//{"1550a298c37344fb.jpg","fefb5e6ae8b646d7.jpg","04b94e60571f44bb.jpg","6a80d43f6b2f4fd0.jpg","14ae45bb503b4b97.jpg"},
//{"0e5d1e98c1ca417f.jpg","ea957fb41d39459c.jpg","4a8bdea52c924176.jpg","7ffadc90be6a44a7.jpg","d8578bf19b4c42fd.jpg"},
//{"e381b1ed59204054.jpg","1ce0dd1aa8a84b89.jpg","4914b55f65c340bc.jpg","74926c12ef354800.jpg","53122f9b8c494110.jpg"},
//
//{"f621203a6496457d.jpg","9f559397674f4733.jpg","f82b09055dfe4ada.jpg","521eaedbb8984c98.jpg","f5db4733e8c14e1c.jpg"},
//{"1e043227b5a444ee.jpg","969491ac4a0c4b3a.jpg","c2c35cedcb614dfa.jpg","75be358ce053465a.jpg","7ec2911d7cea4f82.jpg"},
//{"25d056aafad24c54.jpg","9cdc2b1e528a4ee4.jpg","3bb6052f5b644202.jpg","05d96addea344a90.jpg","e996c21f82514d0f.jpg"},
//{"51796be04a1a453e.jpg","adbbdb334d2d4777.jpg","dd1cb0488fcc4bfb.jpg","6fa574c4ba944310.jpg","bbb2588d53804454.jpg"},
//{"8feac44536c34355.jpg","e292013aa33a468f.jpg","46dc0fcaf4814a1a.jpg","6be4c1229b994147.jpg","2b99695f2b224987.jpg"},
//
//{"5185852147a347ca.jpg","39c0a8c26bab4db0.jpg","d1b75eb07be24b16.jpg","d8ee9511cc6a4eed.jpg","f4e9eeee9f4544ec.jpg"},
//{"fd6dd405aa724dd6.jpg","3d00099ebe774dac.jpg","9012d2d87db9460b.jpg","9cb18b8d16b4428a.jpg","938e15a0c4e24841.jpg"},
//{"11873f4c73e74b0a.jpg","1b97fe8dfc454b0f.jpg","d830ad9d664f44e0.jpg","b1c980d1841e45ee.jpg","26d5f0e5091e477a.jpg"},
//{"3b475bb41ab04e36.jpg","d5f2ec0233804f90.jpg","9ca5e6f2fbea4684.jpg","2cf0fd0a3a684a99.jpg","6534570448e04dbe.jpg"},
//{"14dc687986754572.jpg","474837c6204e4cc5.jpg","bad1d2b84fa2487a.jpg","144183c14ff44013.jpg","4eafd54ad48c4ca2.jpg"}
//};
//
//		
// 	System.out.println(pname.length + " " + shopprice.length + " " + marketprice.length + " " + pdesc.length + " "
// 				+ psearch.length + " " + ipRouteList.length);
//	}
//
//	@Test
//	public void testInsertProduct() {
//
//
//String pname[] = {
//"运动鞋Air Max270 React",
//"男子跑步鞋Zoom Fly 3",
//"男子运动鞋Nike Zoom 2K",
//"男子篮球鞋Zoom KD12 EP",
//"训练鞋Air Max Alpha",
//"运动鞋Air Max2 Light",
//"跑步鞋React Flyknit 2",
//"篮球鞋Zero Gravity PF",
//"男子运动鞋Nike Shox R4",
//"男子跑步鞋Joyride Run FK",
//"运动鞋Force 1 '07 LV8 3",
//"跑步鞋Legend React 2",
//"运动鞋Element PRM SU19",
//"网球鞋Air Max Wildcard",
//"滑板鞋SB Zoom Low GT",
//"运动鞋Air VaporMax 3",
//"运动鞋Zoom Vomero 5 SP",
//"运动鞋React Element 55",
//"运动鞋ACG Dog Mountain",
//"运动鞋Nike Air Max 98",
//"运动鞋Nike Air Flyknit 3",
//"运动鞋Air Max 270 React",
//"女子跑步鞋Joyride Run FK",
//"女子运动鞋Nike P-6000",
//"运动鞋Zoom X Vista Grind",
//"跑步鞋Epic Flyknit 2",
//"运动鞋Nike Blazer Low LE",
//"跑步鞋Epic Phantom React",
//"训练鞋Motion Trainer",
//"运动鞋React Element 55",
//"女子跑步鞋Zoom Fly FK",
//"女子运动鞋Royale Acslpse",
//"女子运动鞋Air Max Oketo",
//"足球鞋Vapor 12 FG/MG",
//"运动鞋Air 1 RET Low Slip",
//"运动童鞋Pico 5 (PSV)",
//"运动童鞋Air Max 200 (GS)",
//"运动童鞋Air Max 200 (PS)",
//"大童运动童鞋Pico 5 (GS)",
//"运动童鞋Renew Lucent",
//"婴童运动童鞋Pico 5 (TDV)",
//"幼童运动童鞋Novice (PS)",
//"运动童鞋Nitroflo (GS)",
//"篮球童鞋Flight 2 (GS)",
//"运动童鞋Air Max 720 (GS)",
//"跑步童鞋Future Speed 2",
//"运动童鞋Runner 2 (TDV)",
//"跑步童鞋Star Runner 2",
//"运动童鞋Jordan 4 Retro",
//"运动童鞋Huarache G.E.BG"
//
//};
//
//
//String cname[] = {"耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克","耐克"
//};
//
//
//String category[] ={"man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","man","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","woman","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid","kid"
//};
//
//
//double shopprice[] = {1199,1169,699,1299,799,899,1299,559,1299,1399,799,799,949,649,629,1119,1199,899,799,839,1199,1199,1399,799,1299,1299,599,1129,449,899,819,499,419,419,749,329,769,599,399,569,299,469,599,569,1169,569,299,399,699,539};
//
//
//double marketprice[] = {1300,1205,728,1388,851,955,1389,576,1450,1508,854,829,998,672,651,1254,1351,957,839,855,1354,1301,1507,880,1507,1489,721,1209,489,1009,951,618,451,509,819,399,915,749,507,609,351,509,730,675,1307,589,341,527,818,769};
//String pdesc[] ={
//"柔软缓震设计，缔造舒适穿着体验",
//"提供强劲推力，助你一路畅跑",
//"橡胶鞋翼从外底两侧包覆至鞋面",
//"缓震创新技术，轻松驾驭整场比赛",
//"Max Air 缓震配置提供舒适感受。",
//"柔软泡棉打造舒适的日常穿着体验",
//"灵敏响应的性能，成就非凡表现力",
//"轻盈鞋面有助稳定双足且舒适贴合",
//"融入穿孔设计，帮助双足保持凉爽",
//"足底部分贴合足型，助力畅跑",
//"大胆配色，塑就时尚外观。",
//"泡棉塑就出众稳定性和缓震效果",
//"泡棉弹性出众，塑就前沿造型",
//"Max Air 气垫，塑就缓震迈步体验",
//"具响应灵敏的轻盈缓震性能",
//"带来弹力充沛的迈步体验",
//"妥帖包覆足部，提供透气支撑效果",
//"Nike React 技术，焕新经典格调",
//"泡棉缓震配置，塑就舒适穿着体验",
//"缓震系统和利落线条设计惊艳亮相",
//"水纹形线条、反光滚边和缓震配置",
//"柔软缓震设计令你犹在云端",
//"足底部分贴合足型，助力畅跑全程",
//"透气网眼布再现千禧年代的跑鞋风格",
//"叛逆与优雅的新奇碰撞彰显出众强大",
//"具备轻盈平滑性能和醒目外观",
//"优质外观和舒适感受，展现篮球风范",
//"一脚蹬款式设计，方便轻松穿上",
//"搭配弹性固定带，实现多向抓地力",
//"Nike React技术打造，焕新经典格调",
//"鞋面宛如手套般轻盈且富有支撑力",
//"出众风范和舒适感受营造经典风格",
//"采用简约设计，塑就舒适缓震性能",
//"两片式外底系统，实现推进抓地力",
//"便捷按扣，塑就舒适的出行体验",
//"稳固贴合，抓地力出众",
//"波纹线条灵感来自流动岩浆波纹",
//"采用弹性鞋带设计，方便鞋款穿脱",
//"以耐穿材料制成，易于穿脱",
//"柔软泡棉缓震配置，造就舒适体验",
//"稳固贴合，抓地力出众。易于穿脱",
//"一脚蹬款式设计让孩子乐享玩耍体验",
//"将舒适性和耐穿性合二为一",
//"缓震性能柔软，助你畅享舒适体验",
//"从地质奇观中汲取灵感，彰显优雅格调",
//"轻盈非凡，助你快速冲过终点线",
//"易于穿脱，可像巨星般嬉戏玩耍",
//"轻盈耐穿，缔造非凡舒适感受",
//"柔软泡棉缓震配置，非凡舒适",
//"弹性材料，妥善包覆双足，舒适贴合"
//};
//
//String psearch[] ={
//"耐克-男-绿-休闲-运动鞋Air Max270 React-en-ar",
//"耐克-男-绿-跑步-男子跑步鞋Zoom Fly 3-en-ru",
//"耐克-男-红-休闲-男子运动鞋Nike Zoom 2K-re-ar",
//"耐克-男-红-篮球-男子篮球鞋Zoom KD12 EP-re-ba",
//"耐克-男-黄-篮球-训练鞋Air Max Alpha-ye-ba",
//"耐克-男-黄-跑步-运动鞋Air Max2 Light-ye-ru",
//"耐克-男-棕-跑步-跑步鞋React Flyknit 2-br-ru",
//"耐克-男-棕-篮球-篮球鞋Zero Gravity PF-br-ba",
//"耐克-男-紫-跑步-男子运动鞋Nike Shox R4-pu-ru",
//"耐克-男-紫-跑步-男子跑步鞋Joyride Run FK-pu-ru",
//"耐克-男-蓝-篮球-运动鞋Force 1 '07 LV8 3-ue-ba",
//"耐克-男-蓝-跑步-跑步鞋Legend React 2-ue-ru",
//"耐克-男-黑-足球-运动鞋Element PRM SU19-ack-fo",
//"耐克-男-黑-休闲-网球鞋Air Max Wildcard-ack-ar",
//"耐克-男-黑-休闲-滑板鞋SB Zoom Low GT-ack-ar",
//"耐克-男-黑-跑步-运动鞋Air VaporMax 3-ack-ru",
//"耐克-男-灰-休闲-运动鞋Zoom Vomero 5 SP-gr-ar",
//"耐克-男-灰-跑步-运动鞋React Element 55-gr-ru",
//"耐克-男-青-休闲-运动鞋ACG Dog Mountain-cyan-ar",
//"耐克-男-橙-跑步-运动鞋Nike Air Max 98-or-ru",
//"耐克-女-绿-跑步-运动鞋Nike Air Flyknit 3-en-ru",
//"耐克-女-绿-休闲-运动鞋Air Max 270 React-en-ar",
//"耐克-女-红-跑步-女子跑步鞋Joyride Run FK-re-ru",
//"耐克-女-红-休闲-女子运动鞋Nike P-6000-re-ar",
//"耐克-女-黄-休闲-运动鞋Zoom X Vista Grind-ye-ar",
//"耐克-女-黄-跑步-跑步鞋Epic Flyknit 2-ye-ru",
//"耐克-女-棕-休闲-运动鞋Nike Blazer Low LE-br-ar",
//"耐克-女-棕-跑步-跑步鞋Epic Phantom React-br-ru",
//"耐克-女-紫-足球-训练鞋Motion Trainer-pu-fo",
//"耐克-女-紫-足球-运动鞋React Element 55-pu-fo",
//"耐克-女-蓝-跑步-女子跑步鞋Zoom Fly FK-ue-ru",
//"耐克-女-蓝-足球-女子运动鞋Royale Acslpse-ue-fo",
//"耐克-女-黑-休闲-女子运动鞋Air Max Oketo-ack-ar",
//"耐克-女-青-足球-足球鞋Vapor 12 FG/MG-cyan-fo",
//"耐克-女-橙-篮球-运动鞋Air 1 RET Low Slip-or-ba",
//"耐克-儿童-绿-跑步-运动童鞋Pico 5 (PSV)-en-ru",
//"耐克-儿童-绿-篮球-运动童鞋Air Max 200 (GS)-en-ba",
//"耐克-儿童-红-篮球-运动童鞋Air Max 200 (PS)-re-ba",
//"耐克-儿童-红-跑步-大童运动童鞋Pico 5 (GS)-re-ru",
//"耐克-儿童-黄-篮球-运动童鞋Renew Lucent-ye-ba",
//"耐克-儿童-黄-休闲-婴童运动童鞋Pico 5 (TDV)-ye-ar",
//"耐克-儿童-棕-休闲-幼童运动童鞋Novice (PS)-br-ar",
//"耐克-儿童-棕-篮球-运动童鞋Nitroflo (GS)-br-ba",
//"耐克-儿童-蓝-篮球-篮球童鞋Flight 2 (GS)-ue-ba",
//"耐克-儿童-蓝-休闲-运动童鞋Air Max 720 (GS)-ue-ar",
//"耐克-儿童-灰-跑步-跑步童鞋Future Speed 2-gr-ru",
//"耐克-儿童-灰-休闲-运动童鞋Runner 2 (TDV)-gr-ar",
//"耐克-儿童-青-跑步-跑步童鞋Star Runner 2-cyan-ru",
//"耐克-儿童-橙-休闲-运动童鞋Jordan 4 Retro-or-ar",
//"耐克-儿童-橙-跑步-运动童鞋Huarache G.E.BG-or-ru"
//
//};
//
//String ipRouteList[][] = {
//{"e175f2803d614030.jpg","971ba3547e0e400f.jpg","0f9ad15992cd4d15.jpg","08170bee2e044038.jpg","8abf3ec4ac8646ee.jpg"},
//{"3516bc584ae94c22.jpg","4054a0a47ac4469c.jpg","0d6af08dc96e442c.jpg","b96a0e01b36e4f55.jpg","da861bd9b56f4f95.jpg"},
//{"b80212aa8d554455.jpg","bfbf3c21bfb6447f.jpg","8daa386cdd6c4443.jpg","5dc4992883f54e71.jpg","33b4f9fcce25448e.jpg"},
//{"514954dd97d24add.jpg","f9d16d6e48284fd1.jpg","57621b0ec6114ef8.jpg","54c4065421c343e3.jpg","1aa12f0b77334c54.jpg"},
//{"eeca43ffced14946.jpg","76ea78fed63c4267.jpg","10ff5bb6ed01416d.jpg","af18a8e111cd40cc.jpg","098c971fea034345.jpg"},
//
//{"4cd00f7e493e46e9.jpg","1226f56740af40cd.jpg","7b36ebbeefa74121.jpg","c45fb1a9dd5a4001.jpg","e4549a5df7af40ed.jpg"},
//{"fbf4ee82f8ef4b13.jpg","b683e3ad14b44c55.jpg","44e1afb2211b4186.jpg","73c5874d811842d4.jpg","9a914809e98b4d1f.jpg"},
//{"a19571242e554971.jpg","db1351747b2d4803.jpg","8ba45072692b42c0.jpg","e29f009dba524d71.jpg","84979e651a5442b2.jpg"},
//{"0779c07055324135.jpg","40994decccf74533.jpg","e53289a275cd4517.jpg","4b90fd33045647ba.jpg","1b6493e864484d12.jpg"},
//{"4387d92a01144cb2.jpg","cfdd60d22e1c49ce.jpg","1f644752126143a8.jpg","06825bea90724cff.jpg","7bbacb279c694c82.jpg"},
//
//{"908156a434394ce2.jpg","96f5f8fbcbfa4f4c.jpg","b2caad63299845e5.jpg","b30b045ccff84ec9.jpg","ee62549fc05d4a95.jpg"},
//{"32b67384c5b748eb.jpg","e6f65510468f491a.jpg","a1182ea0dd6d458d.jpg","261303ddd1f94111.jpg","e28af5e9ac574e3c.jpg"},
//{"2c7706f09d3b47e6.jpg","0fcaab47d13c4e89.jpg","e7b3bacecd84417f.jpg","7e4f4ed51db84fbf.jpg","2cc6c31964794bf0.jpg"},
//{"83d38362fcad4d23.jpg","8cbfbed64c544f63.jpg","adbc226990a94a70.jpg","f498612e7b3d4962.jpg","94bc639d801144a5.jpg"},
//{"4c92aa5d722c44f2.jpg","8474fa1dff224777.jpg","c6d7dbab043d40e4.jpg","644b4bc9fd7647d5.jpg","c08dfcfc8cb64f3f.jpg"},
//
//{"b2b4d57811004e7b.jpg","5186aa16778c47d7.jpg","8aa9a27ca3bf4feb.jpg","05614080d8cf45bb.jpg","0e7121ea958e44dc.jpg"},
//{"d7cf3747bbf94b6d.jpg","f15b96ee3be04fc9.jpg","411eac689e404da4.jpg","1dffce6015a34ad5.jpg","7ae87a21c1c54256.jpg"},
//{"f380524aac344fd5.jpg","fd92143259034b09.jpg","efa316e814884853.jpg","7880666756594b64.jpg","4c5994bccad541f2.jpg"},
//{"05950aca703149b0.jpg","e6b5ec70c35b4763.jpg","25e021bbfb81454a.jpg","141d5e3696c345c8.jpg","b6f4717218ee460e.jpg"},
//{"7d8bed8a77824542.jpg","698d74698cd84c9c.jpg","5c0577fbe7de48e2.jpg","026111d01b074294.jpg","83c16ab1b58540a1.jpg"},
//
//{"d60b46ddd29e4164.jpg","20bebd67943148df.jpg","daca50aa314d4841.jpg","3da6f2497c544949.jpg","b0212ecd73944644.jpg"},
//{"12c98a1308914fa2.jpg","f7df82d4e1b34faf.jpg","47a2054c40284e65.jpg","5170ea21528148a6.jpg","cd62a8475ff4445e.jpg"},
//{"9dab48df888e4005.jpg","41e18d8f7d3b4264.jpg","308d1ecb8f8d4d5a.jpg","6efbb93f28e4410e.jpg","77180d658ff641d1.jpg"},
//{"603d9e54ee754255.jpg","391c6dcc8eca4639.jpg","3c214be624164574.jpg","a9f2bbbda760477c.jpg","26b795dd71f346bc.jpg"},
//{"7b64d2aaa8bf41d5.jpg","70e272d35a77424c.jpg","50c6abc7565c463f.jpg","8cada793ce5c4e63.jpg","c802d36796714fbe.jpg"},
//
//{"06cfb8fb029f4453.jpg","8ed96d7adf5142bc.jpg","5c34da5316414222.jpg","ab3b9da68aa9484e.jpg","7946d77c09a24f8e.jpg"},
//{"9394b2a30f0645ec.jpg","f30ecd774b30407f.jpg","12655008f5ca427b.jpg","c58436979b0f4702.jpg","ad6565a101614808.jpg"},
//{"957067feb8ae4b9d.jpg","2b3e421c0aa34557.jpg","8287c05895b04298.jpg","f0294864f1434824.jpg","f3afd9cd860a4ad2.jpg"},
//{"508506faea2e4abd.jpg","fcd4505125a142cd.jpg","551b49320717425d.jpg","6ec6e70551c54cd4.jpg","f0f702ecb9b34d6d.jpg"},
//{"396cbef116354655.jpg","836a155086c149c1.jpg","5614f3b27ecf4bd0.jpg","1b59dc60e5614c6b.jpg","12dd30e8c4a04de0.jpg"},
//
//{"e4823c745a264089.jpg","a54d9f1d1a7047e4.jpg","3a4d56216a8e4288.jpg","fd834587b6744078.jpg","2137b8715a4b4676.jpg"},
//{"3dba25e8721d4ceb.jpg","e0b099e202d04abd.jpg","e60d9ed13b264e52.jpg","a08bce5bfe5c4de6.jpg","90cf438202ec4c43.jpg"},
//{"6ae73fbbce3e440a.jpg","b881ef793796441b.jpg","99605e0c4c904369.jpg","2832683d55c24215.jpg","53ea3373df804d99.jpg"},
//{"36e14a31ad784e3c.jpg","0378420943114a64.jpg","96ba6e7422344d88.jpg","2a6a38ac48124d11.jpg","2c3cbb6ce009494b.jpg"},
//{"d4135f5b2bad4a9f.jpg","012cae1d36cf4920.jpg","7f813033567f4838.jpg","2f7d2d345ab9470d.jpg","a83b225ef48b421d.jpg"},
//
//{"ab5f9c63c13d4a1e.jpg","45036cb99dd541bb.jpg","1aa0e50c4cde4790.jpg","eb79aa5252cf4a8c.jpg","a2369ebf95614a23.jpg"},
//{"b0f669937e614a24.jpg","8819eaaf81604444.jpg","e10f9cb46af54cd9.jpg","430503a102f844be.jpg","a055322a3f574338.jpg"},
//{"1550a298c37344fb.jpg","fefb5e6ae8b646d7.jpg","04b94e60571f44bb.jpg","6a80d43f6b2f4fd0.jpg","14ae45bb503b4b97.jpg"},
//{"0e5d1e98c1ca417f.jpg","ea957fb41d39459c.jpg","4a8bdea52c924176.jpg","7ffadc90be6a44a7.jpg","d8578bf19b4c42fd.jpg"},
//{"e381b1ed59204054.jpg","1ce0dd1aa8a84b89.jpg","4914b55f65c340bc.jpg","74926c12ef354800.jpg","53122f9b8c494110.jpg"},
//
//{"f621203a6496457d.jpg","9f559397674f4733.jpg","f82b09055dfe4ada.jpg","521eaedbb8984c98.jpg","f5db4733e8c14e1c.jpg"},
//{"1e043227b5a444ee.jpg","969491ac4a0c4b3a.jpg","c2c35cedcb614dfa.jpg","75be358ce053465a.jpg","7ec2911d7cea4f82.jpg"},
//{"25d056aafad24c54.jpg","9cdc2b1e528a4ee4.jpg","3bb6052f5b644202.jpg","05d96addea344a90.jpg","e996c21f82514d0f.jpg"},
//{"51796be04a1a453e.jpg","adbbdb334d2d4777.jpg","dd1cb0488fcc4bfb.jpg","6fa574c4ba944310.jpg","bbb2588d53804454.jpg"},
//{"8feac44536c34355.jpg","e292013aa33a468f.jpg","46dc0fcaf4814a1a.jpg","6be4c1229b994147.jpg","2b99695f2b224987.jpg"},
//
//{"5185852147a347ca.jpg","39c0a8c26bab4db0.jpg","d1b75eb07be24b16.jpg","d8ee9511cc6a4eed.jpg","f4e9eeee9f4544ec.jpg"},
//{"fd6dd405aa724dd6.jpg","3d00099ebe774dac.jpg","9012d2d87db9460b.jpg","9cb18b8d16b4428a.jpg","938e15a0c4e24841.jpg"},
//{"11873f4c73e74b0a.jpg","1b97fe8dfc454b0f.jpg","d830ad9d664f44e0.jpg","b1c980d1841e45ee.jpg","26d5f0e5091e477a.jpg"},
//{"3b475bb41ab04e36.jpg","d5f2ec0233804f90.jpg","9ca5e6f2fbea4684.jpg","2cf0fd0a3a684a99.jpg","6534570448e04dbe.jpg"},
//{"14dc687986754572.jpg","474837c6204e4cc5.jpg","bad1d2b84fa2487a.jpg","144183c14ff44013.jpg","4eafd54ad48c4ca2.jpg"}
//};
//
//				
//				
//				
//		
//		BigDecimal bid = brandsService.getBidByBrandName("NIKE");
//		
//
//		for (int i = 0; i < pname.length; i++) {
//			String cid = categoryService.getCidByCname(category[i]);
//			Product product = new Product();
//			product.setPid(UUIDUtil.get16UUID());
//			product.setPname(pname[i]);
//			product.setShopPrice(new BigDecimal(shopprice[i]));
//			product.setMarketPrice(new BigDecimal(marketprice[i]));
//			product.setPdate(new Date());
//			product.setPdesc(pdesc[i]);
//			product.setSearchinformation(psearch[i]);
//			product.setPflag(new BigDecimal(1));
//			product.setBid(bid);
//			product.setCid(cid);
//			productService.insertProduct(product);
//			ImageProduct imageProduct = new ImageProduct();
//			imageProduct.setPid(product.getPid());
//			for (int j = 0; j < ipRouteList[i].length; j++) {
//				imageProduct.setIpRoute(ipRouteList[i][j]);
//				imageProductService.insertProductImage(imageProduct);
//			}
//			System.out.println("插入成功....." + i);
//		}
//	}
//
//	@Test
//	public void testQueryAllProductWithIMG() {
//		List<Product> queryAllProductWithIMG = productService.queryAllProductWithIMG();
//		for (Product product : queryAllProductWithIMG) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//
//	@Test
//	public void testQueryProductByMan() {
//		List<Product> queryProductByMan = productService.queryProductByMan();
//		for (Product product : queryProductByMan) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//
//	@Test
//	public void testQueryProductByWomen() {
//		List<Product> list = productService.queryProductByWomen();
//		for (Product product : list) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//
//	@Test
//	public void testQueryProductByChildren() {
//		List<Product> list = productService.queryProductByChildren();
//		for (Product product : list) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//
//	@Test
//	public void testQueryProductByVagueString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByVagueStringArray() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectAllProducts() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByGTRange() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByLTRange() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByRange() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByShopPriceASC() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByShopPriceDESC() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByPdateASC() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByPdateDESC() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByBrandName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByPsaleASC() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testQueryProductByPsaleDESC() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testUpdateProductByPid() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSelectManConcentrationTop5ByPdateDESC() {
//		List<Product> list = productService.selectManConcentrationTop5ByPdateDESC();
//		for (Product product : list) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//
//	@Test
//	public void testSelectWomanConcentrationTop5ByPdateDESC() {
//		List<Product> list = productService.selectWomanConcentrationTop5ByPdateDESC();
//		for (Product product : list) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//
//	@Test
//	public void testSelectChildConcentrationTop5ByPdateDESC() {
//		List<Product> list = productService.selectChildConcentrationTop5ByPdateDESC();
//		for (Product product : list) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//
//	@Test
//	public void testQueryProductByHot() {
//		List<Product> list = productService.queryProductByHot();
//		for (Product product : list) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//	
//	@Test
//	public void testQueryProductByBrandBid(){
//		
//		BigDecimal bid = brandsService.getBidByBrandName("XTEP");
//		List<Product> list = productService.queryProductByBrandBid(bid);
//		for (Product product : list) {
//			System.out.println(product);
//			System.out.println(
//					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//			for (ImageProduct imageProduct : product.getImageProducts()) {
//				System.out.println(imageProduct);
//			}
//		}
//	}
//	
//	
//	@Test
//	public void testQueryProductByVague() {
//		String str="ANTA";
//		int i=0;
//		List<Product> queryProductByVague = productService.queryProductByVague(str);
//		for (Product product : queryProductByVague) {
//			System.out.println(product);
//			for (ImageProduct img : product.getImageProducts()) {
//				System.out.println(img);
//			}
//			i++;
//		}
//		System.out.println(i+"===============");
//	}
//	
//	
//	@Test
//	public void sdfdueryProductByVague() {
//		
//		List<Product> queryProductByVague = productService.queryAllProductWithIMG();
//		for (Product product : queryProductByVague) {
//			List<ImageProduct> list = product.getImageProducts();
//			if(list.size()!=5){
//				int count = productService.delete(product.getPid());
//				System.out.println("===删除==========="+product.getPid());
//			}
//		}
//		
//	}
//	
//	
//	@Test
//	public void testGetProductListByPidList() {
//		
//		Random rand = new Random();  
//		
//		String[] pid={"00b76424021a4ce1",
//				"016998585bbe447f",
//				"01f11117126946d6",
//				"037e3d426e9c4045",
//				"0450ee76bb304f6c",
//				"0557fabf57514dac",
//				"05b99154388945eb",
//				"0603278495944a56",
//				"07235bd09d22457f",
//				"07cb012a171c4cd4",
//				"083acd92dd0b4605",
//				"08bd368bf02e4a3d",
//				"09401400e48c4df0",
//				"09ebcedfd0f14041",
//				"0a55b8b152274b61",
//				"0a6420d23df14546",
//				"0a70361e0af14e60",
//				"0a825d03c2784470",
//				"0b33a6808bf949fe",
//				"0b70b67ed9bf4ec2",
//				"0bc81a99cd1548d5",
//				"0e368555c7724dbe",
//				"0f06d2f25064488a",
//				"101e628beb844e54",
//				"104d159082b54c3b",
//				"115ac4a8cd4a40db",
//				"12be20e721954ca6",
//				"12dd9d777e9c4969",
//				"135c5b7270984525",
//				"13af98e63e9a481d",
//				"142f2a0824b141ca",
//				"159c1ea53bac4984",
//				"16dbb94e8fa84f88",
//				"16fc8832dca94fa8",
//				"1736d9b41dff490c",
//				"174d15143d8f48ae",
//				"17a4e86708cd44cb",
//				"17f2b73de17a451a",
//				"18032fef50464f67",
//				"189cb75d90d7402c",
//				"18df4bc2953c4878",
//				"18f8f25b944349a1",
//				"1b044eba0d984589",
//				"1b42e53019084e09",
//				"1bbab2e86d3f4eab",
//				"1c5311f75c154481",
//				"1d9fd390790e43bd",
//				"1df39222d94346d2",
//				"1dfe3829712048bf",
//				"1e74a0d6d10b4886",
//				"1edfb168207842c5",
//				"1f898e760db94628",
//				"1f8a1c7054664337",
//				"1fcad487f08d4b4e",
//				"213c93f5bcb74dca",
//				"219788bc2128454b",
//				"21f56a3be91548b8",
//				"2236a41c8f334e65",
//				"239bad16f1b34729",
//				"25cede1758454130",
//				"25ef4aad516e4f78",
//				"262dfcc377df4ce2",
//				"26b155bf00224e9b",
//				"2900fc09738044ea",
//				"298cb424b3744636",
//				"2a4d309156584ed9",
//				"2ac0f6f155d64c51",
//				"2bc1e9df2e404865",
//				"2bdf896362b94f22",
//				"2c0d224ef9c94fb3",
//				"2c6d08d6217348ce",
//				"2cf1b1d2cdbe4ab6",
//				"2e8cae797fe04a56",
//				"2ea9f1cdcbb1444c",
//				"308601d722fb44e4",
//				"31aa7e35fb6341af",
//				"325fcec36d684e8e",
//				"32ab59763fb04edf",
//				"33151e11783042fa",
//				"3370e5c783e14073",
//				"351f9490f61c4362",
//				"36306bc14c044c09",
//				"365f5805e8d94ee3",
//				"368683bf600941ac",
//				"373cfba06f074eee",
//				"37e202a8c52b4b4a",
//				"385682a0455b479b",
//				"3ab7f0fa3d034666",
//				"3b4a7f4908914fa7",
//				"3b9d83ba1cd24437",
//				"3c018b4e555e4c97",
//				"3d1025cc32c549a0",
//				"3dfba2587c274cc8",
//				"3ef4439971b54bfb",
//				"409e76f28faa4fb7",
//				"40f65d77ffa345e6",
//				"4124eeeb856a47b4",
//				"427025a2dcf04caa",
//				"42b93a44bcc14f06",
//				"4367c398056d441b",
//				"439cc331fe8f4926",
//				"43cd1b9dee3d472e",
//				"450302e994b74277",
//				"45d3e9b42f544acb",
//				"4681701dccf04fe7",
//				"47718b77e4544e96",
//				"477513d44e0d4707",
//				"4888d8c15b154004",
//				"491a10c7a1394edf",
//				"49af9abe37714170",
//				"49e3b576332d4251",
//				"4b0b37d2ef004ffd",
//				"4b2e27a086bd4316",
//				"4b821d4d584940e5",
//				"4c3a83c64a094200",
//				"4c9e8f1f12b74fa3",
//				"4e1884d4fc924359",
//				"4e247ed1d61741bf",
//				"4fdc05b3dc0348f5",
//				"5006e481d4f64fd6",
//				"512935d1d4aa432e",
//				"5153975424b14c33",
//				"51b67f48360f491b",
//				"52063464ae2b43d6",
//				"520d259215424109",
//				"528f7500a189467d",
//				"5359148d15644c92",
//				"53e577f66a134603",
//				"544af414c59f4fc7",
//				"54683546434f4c1d",
//				"562f30d0f80148ae",
//				"565402c72f334462",
//				"56c1d3a6bd55400f",
//				"56fcb8aabdfe4d04",
//				"571e73d8743048cd",
//				"57fab252e10e48ed",
//				"5ac07421d7cb470a",
//				"5ad1502a71f74192",
//				"5af1f1aebcfb40fb",
//				"5b5968062f3548b7",
//				"5b879a0842b547b9",
//				"5b95d546965f45b3",
//				"5beed3cc7b3944aa",
//				"5de60bb6f802477a",
//				"5e0a9070c48444eb",
//				"5e4abca2c13045f6",
//				"5e55c7ba7d924770",
//				"5e6ba92cac124a01",
//				"5ee95600947144ba",
//				"5f7f8cb8d7154180",
//				"5fdcc2bf271a45ab",
//				"600f91eb18b14f66",
//				"61127370530f4666",
//				"6258d6834f3440a8",
//				"6273c4bf2e064ca8",
//				"62760fe0e4df4ce4",
//				"63036361d94548d9",
//				"631b5e91f1814841",
//				"6531557f567a4258",
//				"656bb41451514ad6",
//				"69237abdc5ca4c99",
//				"6af8c4ec17864a8a",
//				"6b20908207844e9d",
//				"6bc25916605e4a0c",
//				"6bee880cc66044ed",
//				"6cba8d65e8634c82",
//				"6d7089b242514f22",
//				"6e3a16d3e2d542bb",
//				"6e5e38969ea44133",
//				"6f4ce147362d4ca7",
//				"6f656229ff544f57",
//				"6f99581ad18a4d88",
//				"712afee2733e4358",
//				"71cbbb88f89e4173",
//				"721638f77a894602",
//				"722b4a9a19834fc6",
//				"72bbd05fad774124",
//				"730a93c97e0848c9",
//				"74a45d0336074cfe",
//				"759dc2fe3a04448b",
//				"75baa74a2fe44822",
//				"760d60fed48e4156",
//				"76b12e4ca8a84019",
//				"7787a6d86d574c92",
//				"77bf5a3417e94ff5",
//				"788d85d9275748da",
//				"78f79aab015e44ed",
//				"7981dae99bf34163",
//				"7a1e5ff3f0a14741",
//				"7aaa2295a9844a46",
//				"7b015b35f85749f3",
//				"7c13683fa9fe4897",
//				"7c39b3a54289415e",
//				"7c64cdb14dc54599",
//				"7d47d7529c3e475c",
//				"7d6a94f30067437d",
//				"7d79c1e9b64b4371",
//				"7d7ba4728cee4f72",
//				"7f1e6418dba04c7e",
//				"7f1f87b8261642e3",
//				"7f7d404e825b4f51",
//				"804e4600c5844ff5",
//				"80538593e56a4741",
//				"810bf12178c546ec",
//				"853f74a0eb99403e",
//				"85f05ac9e7054c03",
//				"86402e10b7d34a71",
//				"874dc57fa2e94cb8",
//				"8817c9a169fe4555",
//				"89a9404a4a684f23",
//				"89f83185b9e34b3f",
//				"8b6d11d89e1f4459",
//				"8df7bce261d24248",
//				"8dfcacbef7824532",
//				"8e47cd7d176940ff",
//				"8edaec16e2ff4b77",
//				"8eeaaefe2aa44338",
//				"8eee9e11746644f5",
//				"907304e940e64ee2",
//				"90a8ecd488424a48",
//				"917bcf4de7ca4803",
//				"9269bbe9a5a54827",
//				"939408480be54cb2",
//				"94045a5a0e7b402a",
//				"968cd73ec5314df9",
//				"96b85ad92d294d01",
//				"97d1d5c63fe14772",
//				"97f450d60cd945bf",
//				"9806266bec4244f7",
//				"98068417873e40b8",
//				"98261972e3c34ac7",
//				"990717a7c27746e2",
//				"99927918f0fc42dc",
//				"99efdd6663a44c2a",
//				"9aa5071bc1104761",
//				"9ba0da4f7b2a4db1",
//				"9bdc8388c117486a",
//				"9c0c5b4ac2da418f",
//				"9e77d9ba752d4d4b",
//				"9fae218c47054e1b",
//				"a03a393d5a2343b6",
//				"a35191f3b8c549e5",
//				"a3899641f66845b2",
//				"a41f57d146f94804",
//				"a6563928648b46b9",
//				"a6cb27ba24484abd",
//				"a6fe479ffddf4887",
//				"abcfbcee67ba485f",
//				"acd84c7431144f0f",
//				"ad945118a8bf4f0f",
//				"add4ac86707e4db7",
//				"add6df9f06a14c3c",
//				"af161e845425473d",
//				"afa9b16daef24b13",
//				"b0977a681c4d4878",
//				"b102f56439434cd6",
//				"b112d8a59c804b82",
//				"b224a27316814ce2",
//				"b312a6f2fe4044d5",
//				"b4069c6975bc4ec8",
//				"b5719cdf879945ed",
//				"b8b543bc60064d60",
//				"b91a7102799e4d1f",
//				"b93e1187590a4b97",
//				"ba3fd4c0822d4ea1",
//				"ba8a73472af6466e",
//				"baa6294f9e2e4cbd",
//				"badcedd0eb184cb2",
//				"bbac9f52ddde42d9",
//				"bbcc355edd7549c9",
//				"bbf4e2319a784e17",
//				"bc36ad6578924a10",
//				"bc3e97ceae354210",
//				"bcb5aade47174ed2",
//				"bd474e92996a45cf",
//				"bd5dfda62f924425",
//				"bd9408573ac349e6",
//				"bdab90fc4fa44aea",
//				"bdb7148568b64c90",
//				"be55cf7e9dd4458d",
//				"bf851e7433a44ea8",
//				"c061db7e88964c1e",
//				"c077aadf3ad14609",
//				"c40f1027ef614b78",
//				"c4137b23d0e942a8",
//				"c42fbd1227284c26",
//				"c50ed72369dc42cf",
//				"c5cc9a4faffc4292",
//				"c5ebe208f3cd4526",
//				"c6039ce8b768441b",
//				"c64a2af2de024303",
//				"c68ff97e12c046df",
//				"c7504562c5164e07",
//				"cc169d9065f1440a",
//				"cc1aec6e9da740f6",
//				"cc2563dcd7c3459d",
//				"cc9e183136f744a7",
//				"cd74eeade0024129",
//				"cf07bea09f0846ed",
//				"cfa3f68559744634",
//				"cfd7c3cb12374501",
//				"d02c90924e294fc6",
//				"d08fad8df04843e9",
//				"d10ff0b07d7a4eb1",
//				"d14d7a12d035455c",
//				"d1638fe0c0db4391",
//				"d1b17ff1f33c419c",
//				"d4382bbc1c5c4cb9",
//				"d5b10d3688eb406a",
//				"d63c205dd653427b",
//				"d66f6a1f4bcb4f23",
//				"d6d28cb2a46b4a7a",
//				"d742e1067b54463c",
//				"d8a44055fbaa417d",
//				"d8e11e08c304492b",
//				"d9e802d0a8004702",
//				"db02131ae909421b",
//				"ddaa1f7e6f084644",
//				"de5d20bb29fd48cc",
//				"df5ab9a6a30b4c52",
//				"df904774a93841e3",
//				"e12c72d954394909",
//				"e168a6f63fe448c9",
//				"e1890d1b93fb43dd",
//				"e232533f6d0d4e5f",
//				"e25ef00267be4feb",
//				"e2ec6437119b4634",
//				"e38b0ef3995a4921",
//				"e4de2d1af783435b",
//				"e67978c780174261",
//				"e6bfdc2b66d9440c",
//				"e6f061029d054077",
//				"e7cfa84973e14da0",
//				"e84b1781c10f4cde",
//				"e8ef4e1459e442e7",
//				"e972e249d61648ef",
//				"ed6dce6bb72a49bb",
//				"ef1348cc2d914364",
//				"eff9e4b5c82a4e1b",
//				"f1a3df8e02894f36",
//				"f4746fbaebfd422a",
//				"f50fcddba15e4395",
//				"f59c0e9c03e34764",
//				"f625983dbe1d4436",
//				"f7093fec7d0f419e",
//				"f903acf447504688",
//				"fa6e88daad474afc",
//				"fb1223144c3843c1",
//				"fc7071588b614a5b",
//				"fd95f1d76ab34082",
//				"fdc7d746d5314f06",
//				"feb263c68b6547b1",
//				"ff48faa817024b87",
//				"ff7e31d3f4a34ec8"};
//		
//		
//		
//		
//		
//		for (String pids : pid) {
//			for (int i=27 ; i<45;i++) {
//				
//				ProductSpec productSpec = new ProductSpec();
//				productSpec.setPid(pids);
//				productSpec.setPsSpec(""+i);
//				productSpec.setPsStore(new BigDecimal(rand.nextInt(1500) + 50));
//				stockBackStageService.insertStock(productSpec);
//			}
//		}
//		
//		
//	}
//	
//	
////	@Test
////	public void testInsertProduct1() {
////	
////		String pname[] = { "D.O.N. ISSUE #1 J 篮球鞋", "NEMEZIZ 19.3 LL TF J 足球鞋", "X 19.3 LL TF J 足球鞋",
////				"PREDATOR 19.4 H&L TF J 足球鞋", "DURAMO 9 I 婴童鞋", "GAZELLE 360 I 经典鞋", "TERREX MID GTX K 儿童鞋",
////				"RAPIDARUN K 儿童鞋", "FORTARUN WIDE CF K 儿童鞋", "RAPIDAFLEX EL I 婴童鞋", "FORTAPLAY AC I 鞋",
////				"FORTARUN X MINNIE CF I 婴童鞋", "DURAMO 8 K 儿童鞋", "EQT ADV 360 I 经典鞋", "RAPIDARUN LACELESS KNIT J 大童鞋" };
////
////		double shopprice[] = { 599, 499, 499, 469, 329, 429, 729, 499, 469, 369, 299, 399, 469, 499, 599 };
////		
////		double marketprice[] = { 699, 699, 599, 579, 399, 529, 829, 599, 569, 479, 399, 499, 569, 569, 699 };
////
////		String pdesc[] = { "这款大童篮球鞋，灵感源于Donovan Mitchell多诺万·米切尔的求胜之心。采用人字纹橡胶外底设计，搭配Bounce中底，旨在带来舒适脚感，步伐更添活力。",
////				"这款大童足球鞋，采用合成鞋面，助你舒适发挥球技。采用中帮设计，高度及踝，旨在助力扭转和变向。",
////				"这款大童足球鞋，采用网材鞋面，旨在带来自然脚感和步伐。无系带设计，旨在给前掌更多触球区。含低帮鞋领和模制鞋跟片，伴你舒适行动。",
////				"这款大童足球鞋，采用合成鞋面，配别致后跟，舒适贴合。前掌缀缝线，旨在助你传控射门。配魔术贴粘扣，妥帖贴合。",
////				"这款婴童运动鞋，实用又舒适，力求伴小宝贝室内外开心玩耍。结构紧凑，鞋跟别致，助力自如活动。配魔术贴粘扣带，带来贴合感受。",
////				"这款婴童Gazelle经典鞋，以成人款为灵感，打造新生代版型。以弹力网材鞋面取代系带，方便穿脱，鞋面含闪粉，更显“亮”丽，外底舒适。",
////				"这款中帮徒步鞋，采用GORE-TEX?衬里，旨在为不畏险途的小户外探险家打造。系带设计，Lace Bungee束扣收纳鞋带。Traxion外底。",
////				"这款小童跑步鞋，力求伴小朋友参与多种活动。梭织闭合网眼鞋面，搭配Cloudfoam中底。含橡胶外底，区块式设计。",
////				"这款小童运动鞋，采用稍显宽松的设计，力求助孩子自由驰骋、奔向远方。网眼鞋面。贴心的魔术贴搭扣设计，方便孩子穿脱。",
////				"这款舒适的婴童运动鞋，旨在为好动的小宝贝打造。采用三明治网眼布打造，搭配魔术贴搭扣设计。缝合鞋头。",
////				"旨在为小顽皮们打造的运动鞋。这款婴童运动鞋采用舒适的鞋面和衬里。鞋面搭配宽面束带，力求贴合，鞋跟拉头方便穿脱。",
////				"这款婴童运动鞋，力求为米妮的小粉丝带来欢乐。旨在为女童打造，采用网材鞋面，配魔术贴粘扣带，上缀亮丽的米妮蝴蝶结。设计日常，穿着舒适。",
////				"这款小童跑步鞋，力求陪伴他们度过课间休息和课后活动。Cloudfoam技术，搭配空气网眼鞋面和衬里。合成饰面。",
////				"这款婴童经典鞋，含弹力，旨在方便小脚穿脱，力求有型又舒适。采用网材鞋面，灵感源自Equipment跑鞋的未来感设计。配乙烯/乙酸乙烯酯（EVA）外底，旨在方便宝宝活动。",
////				"无系带，也舒适。这款大童跑步运动鞋，采用袜套式弹力针织鞋面，贴合足部。含Cloudfoam中底和Stretchweb网格外底，力求为步伐添舒适。" };
////	
////		String psearch[] = { "阿迪达斯-儿童-D.O.N. ISSUE #1 J 篮球鞋", "阿迪达斯-儿童-NEMEZIZ 19.3 LL TF J 足球鞋",
////				"阿迪达斯-儿童-X 19.3 LL TF J 足球鞋", "阿迪达斯-儿童-PREDATOR 19.4 H&L TF J 足球鞋", "阿迪达斯-儿童-DURAMO 9 I 婴童鞋",
////				"阿迪达斯-儿童-GAZELLE 360 I 经典鞋", "阿迪达斯-儿童-TERREX MID GTX K 儿童鞋", "阿迪达斯-儿童-RAPIDARUN K 儿童鞋",
////				"阿迪达斯-儿童-FORTARUN WIDE CF K 儿童鞋", "阿迪达斯-儿童-RAPIDAFLEX EL I 婴童鞋", "阿迪达斯-儿童-FORTAPLAY AC I 鞋",
////				"阿迪达斯-儿童-FORTARUN X MINNIE CF I 婴童鞋", "阿迪达斯-儿童-DURAMO 8 K 儿童鞋", "阿迪达斯-儿童-EQT ADV 360 I 经典鞋",
////				"阿迪达斯-儿童-RAPIDARUN LACELESS KNIT J 大童鞋" };
////		
////		String ipRouteList[][] = {
////				{"9e3836b67a9b48c4.jpg","bd6e389a901549de.jpg","1e8036061ccd457b.jpg","c03ec0cf5b9b4a91.jpg","49fb0a9fdfda4b8a.jpg"},
////				{"a812859d76484812.jpg","77264941fcd84906.jpg","caff64ef5be64fd5.jpg","8e0c6e068d05462d.jpg","aca2c33fdc324ef0.jpg"},
////				{"a0ff0184d2554e59.jpg","f72083d659bf48cd.jpg","a277c32fe57d47c6.jpg","84e19822b6064e64.jpg","24711a438649447f.jpg"},
////				{"117c9630c77e4bbe.jpg","7d9866a97b334450.jpg","cc3192c32b7a455a.jpg","2297102c18814512.jpg","52ede64815ab48d7.jpg"},
////				{"0c0cac95aa3047b5.jpg","80fda00716a84d5a.jpg","27737fcb734b49cb.jpg","00a42212f19f4828.jpg","f164cb708dc142b4.jpg"},
////
////				{"fcfd5e2e867642db.jpg","f0ee63a22f184c3a.jpg","8f39ea5b8d3c4437.jpg","1fe286f3265a41e5.jpg","9131e8f05a23433e.jpg"},
////				{"c946f10da1914e11.jpg","0dbabfc810ac4534.jpg","b54781ffc5d4442b.jpg","f044ee63ba26460b.jpg","4ac9ea3919e44421.jpg"},
////				{"4fad1d9dba554022.jpg","40355e25702148bd.jpg","b6692aa97a074aeb.jpg","8343c77bcbe9437e.jpg","4215579fef5a4318.jpg"},
////				{"0bc9dc0fe0ac4d42.jpg","34a5b04494b44ed5.jpg","9dc70e77238c44f7.jpg","256ab48aad284560.jpg","b10d372338454c63.jpg"},
////				{"a7c326bec02f4343.jpg","cbb9892fb7e44c13.jpg","121b2ae5e04a4408.jpg","cd5097b6cfd84724.jpg","1d5a34ef772f42bb.jpg"},
////
////				{"1b4b4618cc8d4e84.jpg","fd532ee5d35746dd.jpg","809dd0bd29a64f4e.jpg","c82eddb7410344fe.jpg","d5bc2e349a7b41a4.jpg"},
////				{"026f7641c1ce4c1c.jpg","5640d443b10c4997.jpg","5e996821907c4aa3.jpg","1f4a271e9f7e4d96.jpg","ce022dde4aca46cf.jpg"},
////				{"a74c27071def4629.jpg","ec61df8c149d4821.jpg","617b9fc9a84b4cd6.jpg","5c882614fb6d4087.jpg","2096112d531847b1.jpg"},
////				{"a7bc6cdf23374da9.jpg","6032ffa6502b43ec.jpg","1596904a3fff445d.jpg","c288da0675a641eb.jpg","9da9c1427b894fc6.jpg"},
////				{"b233d966fa3d44f7.jpg","22abc894534347f3.jpg","d0eee31bc3b54105.jpg","1f7fc3d3aaf842f9.jpg","229b75f9f8af4a67.jpg"}
////
////				};
////
////		BigDecimal bid = brandsService.getBidByBrandName("阿迪达斯");
////		String cid = categoryService.getCidByCname("儿童");
////
////		for (int i = 0; i < pname.length; i++) {
////			Product product = new Product();
////			product.setPid(UUIDUtil.get16UUID());
////			product.setPname(pname[i]);
////			product.setShopPrice(new BigDecimal(shopprice[i]));
////			product.setMarketPrice(new BigDecimal(marketprice[i]));
////			product.setPdate(new Date());
////			product.setPdesc(pdesc[i]);
////			product.setSearchinformation(psearch[i]);
////			product.setPflag(new BigDecimal(1));
////			product.setBid(bid);
////			product.setCid(cid);
////			productService.insertProduct(product);
////			ImageProduct imageProduct = new ImageProduct();
////			imageProduct.setPid(product.getPid());
////			for (int j = 0; j < ipRouteList[i].length; j++) {
////				imageProduct.setIpRoute(ipRouteList[i][j]);
////				imageProductService.insertProductImage(imageProduct);
////			}
////			System.out.println("插入成功....." + i);
////		}
////	}
//
//}
