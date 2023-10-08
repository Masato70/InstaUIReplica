package com.example.instauireplica

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

class CardSmple {
    @Composable
    fun generateSampleData(): List<CardModel> {
        return listOf(
            CardModel(
                id = "0001",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name1",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun),

                    ),
                likes = 381,
                comment = "This is a comment1"
            ),
            CardModel(
                id = "0002",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name2",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 209,
                comment = "This is a comment2"
            ),
            CardModel(
                id = "0003",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name3",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 101,
                comment = "This is a comment3"
            ),
            CardModel(
                id = "0004",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name4",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 334,
                comment = "This is a comment4"
            ),
            CardModel(
                id = "0005",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name5",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 121,
                comment = "This is a comment5"
            ),
            CardModel(
                id = "0006",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name6",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 75,
                comment = "This is a comment6"
            ),
            CardModel(
                id = "0007",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name7",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 24,
                comment = "This is a comment7"
            ),
            CardModel(
                id = "0008",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name8",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 374,
                comment = "This is a comment8"
            ),
            CardModel(
                id = "0009",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name9",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 200,
                comment = "This is a comment9"
            ),
            CardModel(
                id = "0010",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name10",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 33,
                comment = "This is a comment10"
            ),
            CardModel(
                id = "0011",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name11",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 21,
                comment = "This is a comment11"
            ),
            CardModel(
                id = "0012",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name12",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 90,
                comment = "This is a comment12"
            ),
            CardModel(
                id = "0013",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name13",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 23,
                comment = "This is a comment13"
            ),
            CardModel(
                id = "0014",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name14",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 31,
                comment = "This is a comment14"
            ),
            CardModel(
                id = "0015",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name15",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 44,
                comment = "This is a comment15"
            ),
            CardModel(
                id = "0016",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name16",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 55,
                comment = "This is a comment16"
            ),
            CardModel(
                id = "0017",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name17",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 90,
                comment = "This is a comment17"
            ),
            CardModel(
                id = "0018",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name18",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 12,
                comment = "This is a comment18"
            ),
            CardModel(
                id = "0019",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name19",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 24,
                comment = "This is a comment19"
            ),
            CardModel(
                id = "0020",
                accountIcon = painterResource(id = R.drawable.eeh),
                accountName = "Account Name20",
                images = listOf(
                    painterResource(id = R.drawable.droidkun),
                    painterResource(id = R.drawable.droidkun)
                ),
                likes = 90,
                comment = "This is a comment20"
            ),
            )
    }
}