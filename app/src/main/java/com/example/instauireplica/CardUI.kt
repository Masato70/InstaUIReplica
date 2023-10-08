package com.example.instauireplica

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instauireplica.ui.theme.InstaUIReplicaTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

class CardUI {
    @OptIn(ExperimentalPagerApi::class)
    @Composable
    fun InstagramFeed(card: CardModel) {
        // フィード部分のUIを実装します。
        Column() {
            Spacer(modifier = Modifier.padding(top = 0.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(top = 3.dp, bottom = 3.dp)
            ) {
                Icon(
                    painter = card.accountIcon,
                    contentDescription = "投稿アイコン",
                    Modifier
                        .size(50.dp)
                        .padding(start = 10.dp, end = 10.dp),
                    tint = Color.Unspecified,
                )

                Text(text = card.accountName, fontSize = 15.sp, fontWeight = FontWeight.W500)

                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.End)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.qw),
                        contentDescription = " sanbon",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(16.dp),
                    )
                }
            }

            val images = card.images
            val pagerState = rememberPagerState()

            Box(modifier = Modifier.fillMaxSize()) {
                HorizontalPager(
                    state = pagerState,
                    count = images.size,
                    modifier = Modifier.fillMaxSize(),
                ) { page ->
                    Image(
                        painter = images[page],
                        contentDescription = "Image $page",
                        modifier = Modifier.fillMaxSize()
                    )
                }

                Text(
                    text = "${pagerState.currentPage + 1}/${images.size}", fontSize = 12.sp,
                    color = Color.White,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .offset(x = -16.dp, y = 16.dp)
                        .background(Color.Black.copy(alpha = 0.7f), RoundedCornerShape(15.dp))
                        .padding(start = 10.dp, top = 5.dp, end = 10.dp, bottom = 5.dp)
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = "Instagram Heat Icon",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(50.dp)
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = "Instagram Heat Icon",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(50.dp)
                    )
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = "Instagram Heat Icon",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(50.dp)
                    )
                }

                Spacer(Modifier.padding(start = 35.dp))

                repeat(images.size) { iteration ->
                    val color = if (pagerState.currentPage == iteration) Color.Blue else Color.LightGray
                    Box(
                        modifier = Modifier
                            .padding(2.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(5.dp)
                    )
                }

                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.End)
                        .size(50.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = "Instagram Heat Icon",
                        tint = Color.Unspecified,
                    )
                }
            }

            val text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.W500)) {
                    append("${card.likes}件")
                }
            }

            val text1 = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.W500)) {
                    append(card.id)
                }
            }

            Text(
                text = AnnotatedString("いいね！") + text,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 11.dp)
            )

            Text(
                text = text1 + AnnotatedString(card.comment),
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 11.dp, top = 4.dp)
            )

            Text(
                text = "2日前",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(start = 11.dp, top = 5.dp)
            )
        }
    }

}

//@Preview
//@Composable
//fun CardPreview() {
//    InstaUIReplicaTheme() {
//        CardUI().InstagramFeed()
//    }
//}